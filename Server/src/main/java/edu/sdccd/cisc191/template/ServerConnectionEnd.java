package edu.sdccd.cisc191.template;


//v.14.5.0 used lambdas to finish  connection (server end)
//v.14.5.1 concurrency/multithreading to further facilitate the disconnection

public interface ServerConnectionEnd {
    public void message(String name);

    //the multithreading part
    public static void main (String[] args){

        ChoosingUsedCarDisconnection end=new ChoosingUsedCarDisconnection();
        ChoosingUsedCarDisconnection end2=new ChoosingUsedCarDisconnection();

        end.run();
        end2.run();

        //we are going to thread twice. So it will print out 2x3=6 times.
    }
    //this part establishes the ending message. It is a functional interface
    //which I defined as ServerConnectionEnd, with intent to print string message called known as name
}