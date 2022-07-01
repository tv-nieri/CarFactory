package com.tvn.factory;

// Classe para clientes com contrato.
public class CompanyCarFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Tesla(1000, "full", "blue");
            case "B":
                return new Audi(800, "full", "red");
            case "C":
                return new Lexus(790, "full", "silver");
            default:
                System.out.println("Car not available");
                return null;
        }
    }
}
