package edu.sdccd.cisc191.template;
//v.14.5.0 used lambdas to finish  connection (Server end)

public class ChoosingUsedCarDisconnection {

    public static void main(String[] args){

        String name="Okay come back next time";

        ServerConnectionEnd myInterface=(x) -> {

            System.out.println(x);
        };

        myInterface.message(name);
    }
//this ChoosingUsedCarDisconnection class is where lambda is actually used. The name of the string
    // is defined as "Okay come back next time" and ServerConnectionEnd, which was the user-defined interface
    // is used. Name is now substituted as x and it is printed.

}


