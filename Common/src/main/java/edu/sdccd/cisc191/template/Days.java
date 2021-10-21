package edu.sdccd.cisc191.template;

public class Days extends GeneralSpecification implements ChoosingUsedCar{

    private int days;
    public Days (double userprice, int usersafety, double usermileage, double usermpg, int userdays){
        super(double userprice, int usersafety, double usermileage, double usermpg);

        days=userdays;
    }

    protected int getDays(){return this.days;}
}
