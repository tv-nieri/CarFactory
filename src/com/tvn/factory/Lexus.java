package com.tvn.factory;

public class Lexus extends Car {
    public Lexus(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
        this.setBrand("Lexus");
    }
}
