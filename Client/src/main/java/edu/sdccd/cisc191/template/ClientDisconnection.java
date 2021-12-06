package edu.sdccd.cisc191.template;
//v.14.5.0 used lambdas to finish  connection (client end)

public class ClientDisconnection {

    public static void main(String[] args){

        String name="I am finished";

        ClientConnectionEnd myInterface=(x) -> {

            System.out.println(x);
        };

        myInterface.message(name);
    }
//this ClientDisconnection class is where lambda is actually used. The name of the string
    // is defined as "I am finished" and ClientConnectionEnd, which was the user-defined interface
    // is used. Name is now substituted as x and it is printed.

}


