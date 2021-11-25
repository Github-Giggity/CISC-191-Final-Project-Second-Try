package edu.sdccd.cisc191.template;

import java.util.Scanner;

//v.10.5.0 implemented recursion to count the total number of search results that were looked up
public class TotalSearch {

    public static void main(String[] args){ //main method

        int count; //set up the count for the number of vehicles they are looking for
        Scanner input = new Scanner(System.in); //ask for user input

        System.out.println("How many vehicles are you looking at again?"); //actually display and ask
        count = input.nextInt(); //keep that answer in the count variable
        TotalSearch(count);//needs this to actually perform



    }

    public static void TotalSearch(int count){ //bulk of the recursion code
        if(count==0){
            System.out.println("The end");
            // if the count hits zero, meaning all the entry has been accounted for then stop
        }
        else
        {
            System.out.println(count);
            count--;
            TotalSearch(count);
            // if not keep counting and print count for each and every time
        }
    }


}