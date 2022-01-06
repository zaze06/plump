package me.alien.plump;

import me.alien.plump.util.Version;

public class Plump {
    public static final Version VERSION = new Version("1.0");


    public static void main(String[] args) {
        if(args.length > 0){
            if(args[0].equalsIgnoreCase("server")){
                new Server();
            }else{
                new Client(args[0], 3031);
            }
        }
    }
}
