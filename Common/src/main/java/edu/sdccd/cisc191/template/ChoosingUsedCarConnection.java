package edu.sdccd.cisc191.template;

import java.net.*;
import java.io.*;
//v.10.5.2 rewrote the networking by separating the server  connection section from ChoosingUsedCar

public class ChoosingUsedCarConnection {

    public static void main(String[] args) throws IOException{ //this is how the start is written
        ServerSocket ss=new ServerSocket(5555);
        Socket s=ss.accept();
        //accept client connection

        System.out.println("Connection established");

        InputStreamReader in= new InputStreamReader(s.getInputStream());
        //get the client input what it wrote
        BufferedReader bf=new BufferedReader(in);
        String str= bf.readLine();
        //so these are actually gonna read and comprehend it

        System.out.println("Client" + str);

        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("True");
        pr.flush();

        //these are going to send output to client that it indeed received and connections were established
    }
}
