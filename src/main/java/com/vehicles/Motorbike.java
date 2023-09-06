package com.vehicles;

public class Motorbike extends Vehicle {

    private String model;

    private void setModel(String model) { this.model = model; }
    public String getModel() { return model; }

    public Motorbike (String manuf, int gasCap, double price, String model) {
        super(manuf, gasCap, price);
        this.model = model;
    }

    public void printSpecifications (Vehicle vehicle) {
        System.out.println("Motorbike specifications: ");
        super.printSpecifications(vehicle);
    }

    public void accelerate() {
        if (velocity < 120) {
            super.accelerate();
        } else {
            System.out.println("Top velocity reached!!! Km/hr: " + velocity);
        }
    }
    //todo: Adding specific behaviours exclusive for motorbike.
    //todo: Look for the word motorbike and motorcycle and replace for the valid one.

}
