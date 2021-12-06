package edu.sdccd.cisc191.template;


//v.14.5.0 used lambdas to finish  connection (server end)

public interface ServerConnectionEnd {
    public void message(String name);
    //this part establishes the ending message. It is a functional interface
    //which I defined as ServerConnectionEnd, with intent to print string message called known as name
}