package com.vehicles;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleFactory {

    private Scanner scan = new Scanner(System.in);
    private ArrayList<Vehicle> cars = new ArrayList<>();
    private ArrayList<Vehicle> motorbikes = new ArrayList<>();
    public int vehicleCreation = 0;

    // Select type of vehicle, amount and print them.
    // Creates the vehicle.
    public void createVehicle() {

        int choice, vehicle_Amount;

        System.out.println("Select the options to build your vehicle\n" +
                "\n                      Car -> 1" +
                "\n                Motorbike -> 2" +
                "\n              Default Car -> 3" +
                "\n    Back to previous menu -> 0");

        choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            System.out.println("\nHow many cars do you want?");
            vehicle_Amount = scan.nextInt();
            scan.nextLine();
            assemble_Vehicles(vehicle_Amount, choice);
            print_VehiclesSpecifications(cars);

        } else if (choice == 2) {
            System.out.println("\nHow many motorbikes do you want?");
            vehicle_Amount = scan.nextInt();
            scan.nextLine();
            assemble_Vehicles(vehicle_Amount, choice);
            print_VehiclesSpecifications(motorbikes);

        }  else if (choice == 3) {
            System.out.println("Default choice");
            assemble_Vehicles(1, choice);
            print_VehiclesSpecifications(motorbikes);

        } else if (choice == 0) {

        }

    }

    // Type the attributes for each of the vehicles and instanciate
    // createVehicle()
    public void assemble_Vehicles(int vehicle_amount, int choice) {
        //ArrayList<Vehicle> vehicles = new ArrayList();
        if (choice == 3 ) {
            cars.add(new Car("Default", 20, 45000, "default"));
            ++vehicleCreation;
        } else {
            String manuf, model;
            int gasCap;
            double price;

            for (int i = 0; i < vehicle_amount; i++) {
                ++vehicleCreation;
                System.out.println("\nVehicle " + vehicleCreation);
                System.out.println("Type the Manufacturer: ");
                manuf = scan.nextLine();
                System.out.println("Type the model: ");
                model = scan.nextLine();
                System.out.println("Type the price: ");
                price = scan.nextDouble();
                System.out.println("Type the Gas Capacity: ");
                gasCap = scan.nextInt();
                scan.nextLine();

                if (choice == 1) {
                    cars.add(new Car(manuf, gasCap, price, model));
                } else if (choice == 2) {
                    motorbikes.add(new Motorbike(manuf, gasCap, price, model));
                }

            }
        }

    }

    // Print the specifications of each object of the same type
    // createVehicle()
    public void print_VehiclesSpecifications(ArrayList<Vehicle> vehicles) {

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("\nVehicle " + (vehicleCreation - vehicles.size() + i + 1));
            vehicles.get(i).printSpecifications(vehicles.get(i));
        }
        if (vehicles.size() == 1) {
            System.out.println("\nNow you have added a new vehicle to use in the " +
                    "\"Drive vehicles\" application from main application menu!");
        } else if (vehicles.size() > 1) {
            System.out.println("\nNow you have added some new vehicles to use in the " +
                    "\"Drive vehicles\" application from main application menu!");
        }
    }

    // Select amongst all the vehicles that have been created and drive it, then park it.
    // Drives the vehicle.
    public void driveVehicle() {

        if(cars.size() > 0 || motorbikes.size() > 0) {
            Vehicle choosenVehicle = select_Vehicle();
            accelerateAndSlowDown(choosenVehicle);

        } else {
            System.out.println("\nYou haven't created any vehicle!" +
                               "\nGo back to the apps menu and select option 3 to create one.");
        }
    }

    // Select the vehicle by ID x.y; where x is the type of vehicle and y is the vehicle type option.
    // driveVehicle()
    public Vehicle select_Vehicle() {
        printAllAvailableVehicles();

        System.out.println("\nType the id of the vehicle you want to drive: ");
        String vehicle_Choice = scan.nextLine();

        int choosenVehicleType = Integer.parseInt(vehicle_Choice.substring(0, 1));
        int choosenTypeOption = Integer.parseInt(vehicle_Choice.substring(2, 3));

        if (choosenVehicleType == 1) {
            System.out.println("\nChosen vehicle: " +
                    cars.get(choosenTypeOption - 1).getManufacturer() + " " +
                    cars.get(choosenTypeOption - 1).getModel()
            );

            return cars.get(choosenTypeOption - 1);

        } else if (choosenVehicleType == 2) {
            System.out.println("\nChosen vehicle: " +
                    motorbikes.get(choosenTypeOption - 1).getManufacturer() + " " +
                    motorbikes.get(choosenTypeOption - 1).getModel()
            );

           return motorbikes.get(choosenTypeOption - 1);
        }

        return null;
    }

    // Print all the available vehicles
    // driveVehicle()
    public void printAllAvailableVehicles () {
        System.out.println("\nAll available vehicles:");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("\nId --> 1"  + "." + (i + 1));
            cars.get(i).printSpecifications(cars.get(i));
        }
        for (int i = 0; i < motorbikes.size(); i++) {
            System.out.println("\nId --> 2"  + "." + (i + 1));
            motorbikes.get(i).printSpecifications(motorbikes.get(i));
        }

    }

    // Accelerate and slow down the vehicle at the end of the ride park the vehicle.
    // driveVehicle()
    public void accelerateAndSlowDown(Vehicle vehicle) {

        System.out.println(
                "\nTo accelerate the vehicle press \"a\"" +
                        "\nTo slow down press  \"f\"" +
                        "\nTo stop driving type \"p\"\n");
        String command;
        int ascii = 0;

        while (!(ascii == 112)){

            do {
                //todo: discover how to operate the driving by just hold the up and down arrows to increase or decrease the velocoty.
                command = scan.nextLine();
                ascii = command.toLowerCase().charAt(0);
                if (ascii != 97 && ascii != 102 && ascii != 112) {
                    System.out.println(
                            "\nWrong input!! " +
                            "\nTo accelerate the vehicle press \"a\"" +
                                    "\nTo slow down press  \"f\"" +
                                    "\nTo stop driving type \"PARK\"\n");
                }
            } while (ascii != 97 && ascii != 102 && ascii != 112);

            if (ascii == 97) {
                vehicle.accelerate();
            } else if (ascii == 102) {
                vehicle.slowDown();
            }
        }

        vehicle.park();
    }

}
