package com.tvn.factory;

// Classe para cleintes sem contrato.
public class CarFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Volkswagen(900, "full", "white");
            case "B":
                return new Toyota(600, "full", "yellow");
            case "C":
                return new Fiat(200, "full", "green");
            default:
                System.out.println("Car not available");
                return null;
        }
    }
}
