package com.company;

abstract class Car{
    String name = "Unnamed Car";

    public String getInfo(){
        return name;
    }

    public abstract double getPrice();
}

