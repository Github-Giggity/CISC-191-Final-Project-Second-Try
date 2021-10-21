package edu.sdccd.cisc191.template;

//Days is the child or subclass of GeneralSpecification. In inherits everything in there as well as implementing
//ChoosingUsedCar decision section
public class Days extends GeneralSpecification implements ChoosingUsedCar{

    private int days; //set and define instance variable specific to the Days

    //constructors.
    public Days (double userprice, int usersafety, double usermileage, double usermpg, int userdays){
        super(double userprice, int usersafety, double usermileage, double usermpg);

        days=userdays;
    }
    //getter to return
    protected int getDays(){return this.days;}
}
