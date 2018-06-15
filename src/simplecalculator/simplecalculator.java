package simplecalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,###,###,##");
        System.out.println("Simple Calculator!");
        System.out.println("Enter a number:");
        double number1 = scan.nextDouble();
        System.out.println("Enter another number:");
        double number2 = scan.nextDouble();
        System.out.println("Mathematical Operators: \n1 - Addition" + "\n2 - Substractio \n3 - Multiplication \n4 Division");
        System.out.println("Please enter your choice");
       double operator = scan.nextDouble();
        if (number2 == 0 && operator == 4) {
            System.out.println("You cannot divide by zero.");
        } else {
            System.out.println("The result is: " + formatter.format(calculate(number1, number2, operator)));
        }
    }


    private static double calculate(double number1, double number2, double operator)  {
        if (operator == 1) {
            return number1 + number2;
        } else if (operator == 2) {
            return number1 - number2;
        } else if (operator == 3) {
            return number1 * number2;
        } else {
            return number1 / number2;

        }
    }
}