package edu.sdccd.cisc191.template;

import java.io.*; // import i/o statement
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//v.11.5.0
//v.7.5.0 added I/O Streams that read specific color of the vehicle from a defined list

//color is the child or subclass of GeneralSpecification. In inherits everything in there as well as implementing
//ChoosingUsedCar decision section

public abstract class Color extends GeneralSpecification implements ChoosingUsedCar {


    public Color(double userprice, int usersafety, double usermileage, double usermpg) {
        super(userprice, usersafety, usermileage, usermpg);
    }

    public static void main(String [] args){ //main method
        List<String> a= Arrays.asList("White", "Black", "Silver","Gray","Red","Purple","Maroon", "Yellow",
                "Beige,", "Gold", "Bronze", "Green", "Blue", "Two-Tone", "Custom", "Others");

        Comparator<String> alphabeticalOrder=new Comparator<String>(){
        @Override
            public int compare(String a, String b){
            return a.compareTo(b);



        }

        };
        Collections.sort(b, alphabeticalOrder);
        System.out.println(b);


    }
}
