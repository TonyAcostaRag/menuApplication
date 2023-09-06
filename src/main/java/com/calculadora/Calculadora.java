package com.calculadora;

import java.util.Scanner;
public class Calculadora {
    private int num1;
    private int num2;
    private static Scanner scan = new Scanner(System.in);

    public int getNum1() {
        return this.num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double suma (double num1, double num2) {
        return num1 + num2;
    }

    public double resta (double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion (double num1, double num2) {
        return num1 * num2;
    }

    public double division (double num1, double num2) {
        double div = 0.0;
        try {
            div = (100.0 * num1 / num2) / 100.0;
        } catch(ArithmeticException err) {
            System.out.println("Division by zero");
        }
        return div;
    }

    public void printCalculatorMethods_Uses(){
        System.out.println("Enter the first number: ");
        setNum1(scan.nextInt());
        System.out.println("Enter the second number: ");
        setNum2(scan.nextInt());

        // Dividing ints demos
        long c = (long) division(getNum1(), getNum2());
        System.out.println("\nShowing result dividing ints in a long var: " +
                "\n" + num1 + " / "+ num2 + " =\n" + c);

        double d = getNum1() / getNum2();
        System.out.println("\nShowing result dividing ints in a double var: " +
                "\n" + num1 + " / "+ num2 + " =\n" + d);

        double e = (double) getNum1() / getNum2();
        System.out.println("\nShowing result dividing ints by casting one: " +
                "\n" + num1 + " / "+ num2 + " =\n" + e);

        double f = division(getNum1(), getNum2());
        System.out.println("\nShowing result dividing ints multiplied by a double cocient: " +
                "\n" + num1 + " / "+ num2 + " =\n" + f);

        // Multiplying ints
        double g = multiplicacion(getNum1(), getNum2());
        System.out.println("\nShowing result Multiplying ints: " +
                "\n" + num1 + " X "+ num2 + " =\n" + g);

        // Adding ints
        double h = suma(getNum1(), getNum2());
        System.out.println("\nShowing result adding ints: " +
                "\n" + num1 + " + "+ num2 + " =\n" + h);

        // Substracting ints
        double i = resta(getNum1(), getNum2());
        System.out.println("\nShowing result substracting ints: " +
                "\n" + num1 + " - "+ num2 + " =\n" + i);

    }

}
