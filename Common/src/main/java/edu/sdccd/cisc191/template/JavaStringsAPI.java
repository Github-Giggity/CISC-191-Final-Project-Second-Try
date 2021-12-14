package edu.sdccd.cisc191.template;

import java.util.*;
import java.util.stream.Collectors;

//v.15.5.0 added JavaStringAPI ability

public class JavaStringsAPI {

    public static void main(String [] args){
        //cars in an arraylist
        List<Vehicle> car = new ArrayList<>();

        //example of cars
        car.add(new Vehicle("Toyota", "Corolla", 5000));
        car.add(new Vehicle("Ford", "F-150", 9500));
        car.add(new Vehicle("Honda", "Accord", 4000 ));
        car.add(new Vehicle("Dodge", "Charger", 10000));
    }

    List<Vehicle> CheapCar= car.stream()
            .filter(car -> car.price <= 5000)
            .sorted(Comparator.comparing(car -> car.make))
            .collect(Collectors.toList());
        CheapCar.forEach(make -> System.out.println(car.make) );

//filter the car with price less than or greater than 5000, then sort it alphabetically with the make
    //and then collect and print it out


    static class Vehicle{

        String make;
        String model;
        int price;
    public Vehicle(String make, String model, int price){

        this.make=make;
        this.model=model;
        this.price=price;
        //defines the make model and price
    }

    }





}
