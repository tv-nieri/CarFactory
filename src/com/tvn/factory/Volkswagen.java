package com.tvn.factory;

public class Volkswagen extends Car{
    public Volkswagen(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
        this.setBrand("Volkswagen");
    }
}
