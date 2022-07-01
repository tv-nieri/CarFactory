package com.tvn.factory;

public class Fiat extends Car {
    public Fiat(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
        this.setBrand("Fiat");
    }
}
