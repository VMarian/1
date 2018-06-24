package com.vmstud.calculator;

import java.util.Scanner;

public class Calculator {

    Scanner scanner;

    Calculator() {
        this.scanner = new Scanner(System.in);
    }

    private void programManager(double firstNumber, double secondNUmber, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNUmber;
                break;
            case "-":
                result = firstNumber - secondNUmber;
                break;
            case "*":
                result = firstNumber * secondNUmber;
                break;
            case "/":
                result = firstNumber/secondNUmber;
        }
        System.out.println("The result is: " + result);
    }

    private double getDoubleFromStream() {
        System.out.println("Enter a number:");
        String scan = scanner.next();
        try {
            return Double.parseDouble(scan);
        } catch (NumberFormatException e) {
            getDoubleFromStream();
        }
        return 0;
    }

    private String getOperationFromStream() {
        System.out.println("Enter the operation like +, -, *, / :");
        String scan = scanner.next();
        if (scan.matches("(\\+)|(-)|(\\*)|(/)"))
            return scan;
        else {
            System.out.println("Please enter the operator again.");
            getDoubleFromStream();
        }
        return null;
    }


    void execute() {
        double firstNumber = getDoubleFromStream();
        System.out.println("great, now the next one");
        double secondNUmber = getDoubleFromStream();
        String operation = getOperationFromStream();
        programManager(firstNumber, secondNUmber, operation);
    }


}
