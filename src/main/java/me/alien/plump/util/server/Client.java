package me.alien.plump.util.server;

import me.alien.plump.util.Card;

import java.net.Socket;
import java.util.ArrayList;

public class Client {
    private final int id;
    private Socket socket;
    private int points;
    ArrayList<Card> cards = new ArrayList<>();

    public Client(int id, Socket socket, int points) {
        this.id = id;
        this.socket = socket;
        this.points = points;
    }

}
