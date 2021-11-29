package edu.sdccd.cisc191.template;

import java.io.*;

//v.7.5.0 added I/O Streams that read specific transmission of the vehicle from a defined list


//Transmission is the child or subclass of GeneralSpecification. In inherits everything in there as well as implementing
//ChoosingUsedCar decision section
public abstract class Transmission extends GeneralSpecification implements ChoosingUsedCar{
    public Transmission(double userprice, int usersafety, double usermileage, double usermpg) {
        super(userprice, usersafety, usermileage, usermpg);
    }

    public static void main(String [] args){
        try{
            BufferedReader br=new BufferedReader(
                    new FileReader("C:\\Users\\Dell\\Desktop\\CISC 191 IO Streams\\Transmission.txt"));
            String s;
            while((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch(Exception ex){
            return;
        }
    }
}
