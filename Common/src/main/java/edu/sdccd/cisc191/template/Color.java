package edu.sdccd.cisc191.template;

import java.io.*; // import i/o statement
//v.7.5.0 added I/O Streams that read specific color of the vehicle from a defined list

//color is the child or subclass of GeneralSpecification. In inherits everything in there as well as implementing
//ChoosingUsedCar decision section

public class Color extends GeneralSpecification implements ChoosingUsedCar {


    public Color(double userprice, int usersafety, double usermileage, double usermpg) {
        super(userprice, usersafety, usermileage, usermpg);
    }

    public static void main(String [] args){ //main method
        try{ //try catch used to prevent unwanted errors or glitches
            BufferedReader br=new BufferedReader(
                    new FileReader("C:\\Users\\Dell\\Desktop\\CISC 191 IO Streams\\Color.txt"));
            //bufferedreader is the constructor that will read. The file that is
            // to be read from must be defined in filereader constructor
            //which reads it from a directory

            String s; //it will all be string
            while((s=br.readLine()) != null){
                System.out.println(s);
                //so while it reads the string and the line if there isn't null it keep reading and printing
            }
            br.close(); //if it hits null quit
        } catch(Exception ex){
            return; //return if exception thrown
        }
    }
}
