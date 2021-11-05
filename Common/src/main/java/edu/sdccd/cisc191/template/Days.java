package edu.sdccd.cisc191.template;

import java.io.*;

//v.7.5.0 added I/O Streams that read specific days the vehicle is out in the market from a defined list

//Days is the child or subclass of GeneralSpecification. In inherits everything in there as well as implementing
//ChoosingUsedCar decision section
public class Days extends GeneralSpecification implements ChoosingUsedCar{

    public Days(double userprice, int usersafety, double usermileage, double usermpg) {
        super(userprice, usersafety, usermileage, usermpg);
    }

    public static void main(String [] args){
        try{
            BufferedReader br=new BufferedReader(
                    new FileReader("C:\\Users\\Dell\\Desktop\\CISC 191 IO Streams\\Days.txt"));
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
