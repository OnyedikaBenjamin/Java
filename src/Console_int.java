package _4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

public class Console_int {
    public static double maximumOfValues(double x, double y, double z) {   // A static method though.

        double maximumValue = Math.max(x, Math.max(y, z));
        return maximumValue;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 floating point values seperated by spaces");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximumOfValues(number1, number2, number3);

        System.out.println("Maximum is : " + result);
    }


}






