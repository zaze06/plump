package me.alien.plump;

import java.io.*;
import java.net.Socket;

public class Client {

    Socket socket;
    PrintWriter out;
    BufferedReader in;

    public Client(String host, int port) {
        try{
            socket = new Socket(host, port);
            handshake();
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    private void handshake() throws Exception {
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());


    }
}
