package com.tvn.factory;

public class Tesla extends Car{
    public Tesla(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
        this.setBrand("Tesla");
    }
}
