package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1=new VolkswagenPolo20();
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice()+"млн");

        car1=new CruiseControl(car1);
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice()+"млн");

        car1=new ElectricHeating(car1);
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice()+"млн");

        Car car2=new CruiseControl(new ElectricHeating(new VolkswagenPolo21()));
        System.out.println(car2.getInfo());
        System.out.println(car2.getPrice()+"млн");
    }
}
