package edu.sdccd.cisc191.template;

import java.util.Scanner;

//v.9.5.0 implements java generics to calculate the actual total price of the car with added miscellaneous cost
//it makes sure that the value of the variable plugged in are extended from the number class so integer float or in this case double

public class TotalActualPrice<T extends Number //bounds the type> { //class that implements Java generics/collections

        public static void main(String []args) { //main method
            double carprice; //set and instantiate
            double DMVcost; //set and instantiate
            double insurance;  //set and instantiate

            Scanner keyboard = new Scanner(System.in); //ask for user input

            System.out.println("What was the actual price of the car again?_");
            carprice = keyboard.nextDouble();
            System.out.println("What was the total registration and title fee of the vehicle? ");
            DMVcost = keyboard.nextDouble();

            System.out.println("What was the insurance cost of the vehicle?");
            insurance = keyboard.nextDouble();

            T ob; // T object
            TotalActualPrice(T ob) { //constructor to initialize the t object
                this.ob = ob;
            }
            void add () {
                System.out.println(carprice+DMVcost+insurance);
            }
        }
}