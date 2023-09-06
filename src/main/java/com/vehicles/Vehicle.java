package com.vehicles;

import java.util.Scanner;

public class Vehicle {

    private Scanner scan = new Scanner(System.in);
    private String manufacturer;
    private int gasCapacity;
    private double price;
    protected int velocity = 0;

    public Vehicle (String manuf, int gasCap, double price) {
        this.manufacturer = manuf;
        this.gasCapacity = gasCap;
        this.price = (100.0 * price)/100.0;
    }
    //todo: Include more different types of vehicles.

    public void setManufacturer(String manuf) {
        this.manufacturer = manuf;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setGasCapacity(int gasCap) {
        this.gasCapacity = gasCap;
    }
    public int getGasCapacity(){
        return this.gasCapacity;
    }

    public void setPrice(double price) {
        this.price = (100.0 * price)/100.0;
    }
    public double getPrice(){
        return this.price;
    }

    protected String getModel() {
        return null;
    }

    public void printSpecifications(Vehicle vehicle) {
        System.out.println("Manufacturer: " + vehicle.getManufacturer() +
                        "\nModel: " + vehicle.getModel() +
                        "\nGas Capacity: " + vehicle.getGasCapacity() +
                        "\nPrice: " + vehicle.getPrice());
    }

    public void accelerate() {
        this.velocity += 10;
        System.out.println("Km/hr: " + this.velocity);
    }
    public void slowDown() {
        if (velocity >= 10) {
            this.velocity -= 10;
            System.out.println("Km/hr: " + this.velocity);
        } else if (velocity < 10 && velocity > 0) {
            this.velocity = 0;
            System.out.println("Km/hr: " + this.velocity);
        } else if (velocity == 0){
            System.out.println("Vehicle is stopped. Km/hr: 0");
        } else if (velocity < 0) {
            this.velocity = 0;
            System.out.println("Vehicle is stopped. Km/hr: 0");
        }
    }
    public void park() {
        this.velocity = 0;
        System.out.println("\nParking the Vehicle\nKm/hr: " + velocity);
    }

}
