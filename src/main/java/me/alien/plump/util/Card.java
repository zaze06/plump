package me.alien.plump.util;

import java.util.ArrayList;

public class Card {
    final int num;
    final int color;

    public static final int NUM_IDENTIFIER = 0x20;
    public static final int COLOR_IDENTIFIER = 0x21;
    public static final int NUM_DEFUALT = 0x5A;
    public static final int COLOR_DEFUALT = 0x5A;

    public Card(int num, int color) {
        this.num = num;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public int getNum() {
        return num;
    }

    public String toData(){
        ArrayList<Character> out = new ArrayList<>();

        out.add((char) NUM_IDENTIFIER);
        out.add((char) (NUM_DEFUALT + num));
        out.add((char) COLOR_IDENTIFIER);
        out.add((char) (COLOR_DEFUALT + color));

        Object[] tmp1 = out.toArray();
        char[] tmp = new char[tmp1.length];
        for(int i = 0; i < tmp1.length; i++){
            tmp[i] = (char) tmp1[i];
        }
        return String.valueOf(tmp);
    }

    public static Card fromData(String data){
        int num = 0;
        int color = 0;
        for(int i = 0; i < data.length(); i++){
            char c = data.charAt(i);
            if(i == NUM_IDENTIFIER){
                num = (data.charAt(i+1)-NUM_DEFUALT);
            }else if(i == COLOR_IDENTIFIER){
                color = (data.charAt(i+1)-NUM_IDENTIFIER);
            }
        }
        return new Card(num, color);
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", color=" + color +
                '}';
    }
}
