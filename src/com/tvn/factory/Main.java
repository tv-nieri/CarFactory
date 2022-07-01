package com.tvn.factory;

public class Main {
    public static void main(String[] args) {
        Factory f = null;

        Customer c1 = new Customer("B", true);
        f = getCarFactory(c1);
        Car car1 = f.create(c1.getGradeRequest());
        car1.startEngine();

        System.out.println("#");

        Customer c2 = new Customer("A", false);
        f = getCarFactory(c2);
        Car car2 = f.create(c2.getGradeRequest());
        car2.startEngine();

        System.out.println("#");

        Customer c3 = new Customer("C", true);
        f = getCarFactory(c3);
        Car car3 = f.create(c3.getGradeRequest());
        car3.startEngine();

        System.out.println("#");

        Customer c4 = new Customer("C", false);
        f = getCarFactory(c4);
        Car car4 = f.create(c4.getGradeRequest());
        car4.startEngine();


    }

    private static Factory getCarFactory(Customer c) {
        if (c.hasCompanyContract())
            return new CompanyCarFactory();
        return new CarFactory();
    }
}
