package com.company;

public class CruiseControl extends Decorator{
    Car car;
    public CruiseControl(Car car){
        this.car=car;
    }
    @Override
    public double getPrice() {
        return car.getPrice()+1.5;
    }

    @Override
    public String getInfo() {
        return car.getInfo()+ "+CruiseControl";
    }
}
