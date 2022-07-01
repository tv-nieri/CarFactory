package com.tvn.factory;

import java.util.Locale;

public abstract class Car {

    private String brand;
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println("Your " + brand + " is ready!\n" + "The " + fuelSource +
                " engine is started with " + horsePower + " HPs.");
    }

    public void clean() {
        System.out.println("Car is clean and the color " +
                color + " shines!");
    }

    public void mechanicCheck() {
        System.out.println("Car is checked!");
    }

    public void fuelCar() {
        System.out.println("Car is being filled with " +
                fuelSource.toLowerCase(Locale.ROOT));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
