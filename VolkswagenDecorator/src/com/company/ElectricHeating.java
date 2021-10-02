package com.company;

public class ElectricHeating extends Decorator{
    Car car;

    public ElectricHeating(Car car){
        this.car=car;
    }
    @Override
    public double getPrice() {
        return car.getPrice()+1.5;
    }

    @Override
    public String getInfo() {
        return car.getInfo()+ "+ElectricHeating";
    }
}
