package com.tvn.factory;

public class Audi extends Car{
    public Audi(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
        this.setBrand("Audi");
    }
}
