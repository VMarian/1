package com.vmstud.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculator {

    private static final DecimalFormat df = new DecimalFormat(".##");

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        print("Simple Calculator!\nEnter a number:");
        double number1 = scan.nextDouble();

        print("Enter another number:");
        double number2 = scan.nextDouble();

        print("Mathematical Operators: " +
                "\n1 - Addition" +
                "\n2 - Subtraction " +
                "\n3 - Multiplication " +
                "\n4 - Division" +
                "\nPlease enter your choice:");
        int operator = scan.nextInt();

        while (operator == 4 && number2 == 0) {
            print("You cannot divide by zero. Please provide a non zero number for division:" +
                    "\nEnter a non zero number:");

            number2 = scan.nextDouble();
        }

        print("The result is: " + df.format(calculate(number1, number2, operator)));

    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static double calculate(double a, double b, int operator) {

        switch(operator){
            case 1 : return a + b;
            case 2 : return a - b;
            case 3 : return a * b;
            case 4 : return a / b;
            default: throw new IllegalArgumentException("Wrong value for operator parameter: " + operator) ;
        }
    }
}