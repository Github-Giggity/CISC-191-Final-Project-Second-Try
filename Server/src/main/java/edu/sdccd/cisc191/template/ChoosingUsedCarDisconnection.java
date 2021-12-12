package edu.sdccd.cisc191.template;
//v.14.5.0 used lambdas to finish  connection (Server end)


//v.14.5.1 concurrency/multithreading to further facilitate the disconnection
public class ChoosingUsedCarDisconnection implements Runnable {
    //going to implement runnable
    public static void main(String[] args){

        String name="Okay come back next time";

        ServerConnectionEnd myInterface=(x) -> {

            System.out.println(x);
        };

        myInterface.message(name);
    }

    //start of the runnable implementation the multithreading part
    @Override

    public void run(){

        for (int i=1; i<=3; i++){
            System.out.println("Okay come back next time");

            try{
                Thread.sleep(2000);
                //when  looping through make it pause forr 2 sec
            }catch(InterruptedException e){

            }
        }
    }
//this ChoosingUsedCarDisconnection class is where lambda is actually used. The name of the string
    // is defined as "Okay come back next time" and ServerConnectionEnd, which was the user-defined interface
    // is used. Name is now substituted as x and it is printed.

}


