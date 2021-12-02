package edu.sdccd.cisc191.template;

import java.net.*;
import java.io.*;
//v.10.5.2 rewrote the networking by separating the client connection section from JavaFX

public class ClientConnection {
    public static void main(String[] args) throws IOException { //typically how it is started
        Socket s = new Socket("localhost", 5555);
        //identify the host and port of the client end

        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("Entering");
        pr.flush();
            //these are going to send it to the server
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        //receive and identify the input from the server

        BufferedReader bf=new BufferedReader(in);
        //bufferedreader to read text input
        String str=bf.readLine();

        System.out.println("Server"+str);

        //reade it and label it as being sent from server
    }
}
