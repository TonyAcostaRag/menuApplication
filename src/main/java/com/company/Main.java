package com.company;

import java.util.Scanner;

import com.Matrix.arreglo1;
import com.calculadora.Calculadora;
import com.temporaryName.TemporaryClass;
import com.vehicles.VehicleFactory;
import utils.*;

public class Main {


	public static arreglo1 tres = new arreglo1();

	public static Utilities util = new Utilities();
	public static VehicleFactory vehicleRequest = new VehicleFactory();
	public static Scanner scan;
	public static String applicationMenu = "\nChoose the application you want to use by typing their number, " +
			"then press enter: \n" +
			"\n					   	  Calculator -> 1" +
			"\nOracle Question Primitives (temp) -> 2" +
			"\n					 Create vehicles -> 3" +
			"\n				      Drive vehicles -> 4" +
			"\n				      Llenar matriz -> 5" +
			"\n					  Exit apps menu -> 0" +
			"\nAvailable vehicles for driving: ";
	public static String seeMenuAgain = "\nWant to see the apps menu again?" +
			"\nYes -> 1" + "\nNo -> 0";


	public static int integerValidator (int minValue, int maxValue,  String prompt) {

		String command;
		int ascii;

		do {
			command = scan.nextLine();
			ascii = command.charAt(0);
			if (ascii < util.getASCIICode(minValue) || ascii > util.getASCIICode(maxValue)) {
				System.out.println("\nWrong input!!\n" + prompt);
			}
		} while (ascii < util.getASCIICode(minValue) || ascii > util.getASCIICode(maxValue));

		return Integer.parseInt(command);
	}

    public static void main(String[] args) {

    	//todo: discover how to create a visual application for the vehicle class.
		//todo: include the benefits analyzer application into the main app menu.

		scan = new Scanner(System.in);
		int [][] nums = new int [3][3];
		int num = 0;

    	do {

			System.out.println(applicationMenu + vehicleRequest.vehicleCreation);
			switch (integerValidator(0, 5, (applicationMenu + vehicleRequest.vehicleCreation))) {
				case 1:
					System.out.println("\nFor using the calculator follow the instructions");
					Calculadora cal = new Calculadora();
					cal.printCalculatorMethods_Uses();
					break;

				case 2:
					System.out.println("\nOracle course");
					TemporaryClass tClass = new TemporaryClass();
					tClass.printTemporary();
					break;

				case 3:
					System.out.println("\nVehicles Creation");
					vehicleRequest.createVehicle();
					break;

				case 4:
					System.out.println("\nDrive vehicles");
					vehicleRequest.driveVehicle();
				case 5:
					System.out.println("\nLlenar matriz");
					tres.tridi(nums);
				default:
					break;
			} // end app switch

			System.out.println(seeMenuAgain);
		} while (integerValidator(0, 1, seeMenuAgain) == 1);

    } // end main method

} // end Main class
