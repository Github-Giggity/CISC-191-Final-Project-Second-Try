package edu.sdccd.cisc191.template;

public class GeneralSpecification {

    double price; // set and define the price
    int safety;//set and define the safety rating
    double mileage; //set and define the mileage
    double mpg; // set and define the miles per gallon

    public GeneralSpecification(double userprice, int usersafety, double usermileage, double usermpg)
    {
        price=userprice;
        safety=usersafety;
        mileage=usermileage;
        mpg=usermpg;
    }

    protected double getPrice(){return this.price;}
    protected int getSafety(){return this.safety;}
    protected double getmileage(){return this.mileage;}
    protected double usermpg(){return this.mpg;}
}
