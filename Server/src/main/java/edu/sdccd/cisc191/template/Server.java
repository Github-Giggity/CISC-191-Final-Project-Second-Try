package edu.sdccd.cisc191.template;


/*
 * This program is used to determine which used car inventory the user should be seriously considering.
 * It does this by narrowing down the used car inventory. It will ask for the price, safety, mileage and fuel economy and based on that, determine whether that
 * particular vehicle is suitable  or not. As of now it is in very early stage and am planning to make it more complex
 * and elaborate as it progresses
 */

import java.util.Scanner; // Import the Scanner class

 class ChoosingUsedCar{ // start of the class

    public static void main(String []args){ //main method
        double price; // set and define the price
        int safety; //set and define the safety rating
        double mileage; //set and define the mileage
        double mpg; // set and define the miles per gallon

        Scanner keyboard = new Scanner (System.in); //Create a scanner object
        System.out.println("Enter the price"); //asks user to enter the price
        price=keyboard.nextDouble(); // store the price

        System.out.println("Enter the safety rating"); //asks user to enter the safety rating
        safety=keyboard.nextInt();//store the safety rating

        System.out.println("Enter the mileage on the odometer"); //asks the used to enter the mileage of the vehicle
        mileage=keyboard.nextDouble(); // store the mileage

        System.out.println("Enter the fuel economy number"); // asks the user to enter the mpg
        mpg=keyboard.nextDouble(); //stores the mpg

        // below series of nested if else statements used to come up with the solution.

        if (price <= 9000)
        {
            if (safety >= 4)
            {
                if (mileage <= 125000)
                {
                    if (mpg >= 25)
                    {
                        System.out.println("You found your car!");
                    }
                    else
                    {
                        System.out.println("Go check it out. But be sure to negotiate to get the price down");
                    }
                }
                else
                {
                    System.out.println("Possible additional maintenance fee. Avoid");
                }
            }
            else
            {
                System.out.println("Deathtrap! Don't Buy");
            }

        }
        else
        {
            System.out.println("No suitable car. Come back after a while");
        }
    }
} //end class
