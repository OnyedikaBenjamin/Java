package Operators;

import java.util.Scanner;

public class DivisibleBy {

//    The Divisible operator (%)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       for(int count =0; count<4; count++){

            System.out.print("Enter an integer : ");

            int numberEntered = input.nextInt();    // Always remember to put this function immediately after your statement

            if (numberEntered % 2 == 0) {                       // If number can be divided by 2.
                System.out.println("This is an Even number!");
            }
            else if  (numberEntered % 2 != 0) {                // If number cannot be divided by 2.
                System.out.println("This is an odd number!!");
            }

            else if (numberEntered % 5 == 0) {                // If number can be divided by 5.
                System.out.println("Hi-five!!!");
            }
        }
    }

}
