package com.vehicles;

public class Car extends Vehicle {
    //todo: create different types of cars, such as Deportives and non deportives.

    private String model;

    private void setModel(String model) { this.model = model; }
    public String getModel() { return model; }

    public Car (String manuf, int gasCap, double price, String model) {
        super(manuf, gasCap, price);
        this.model = model;
    }

    public void printSpecifications (Vehicle vehicle) {
        System.out.println("Car specifications: ");
        super.printSpecifications(vehicle);
    }

    public void accelerate() {
        if (velocity < 260) {
            velocity += 15;
            super.accelerate();
        } else {
            System.out.println("Top velocity reached!!! Km/hr: " + velocity);
        }
    }
    public void slowDown() {
        velocity -= 10;
        super.slowDown();
    }

}
