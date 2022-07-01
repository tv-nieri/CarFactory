package com.tvn.factory;

public class Toyota extends Car{
    public Toyota(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
        this.setBrand("Toyota");
    }
}
