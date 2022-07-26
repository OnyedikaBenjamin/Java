package Loops_IterationStatements;

import java.util.Scanner;

public class While_Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name ="";

// Here we say, if the condition is true, the while loop will prompt the user until he enters his name.

        while (name.isBlank()) {                              // This is the condition!!
            System.out.println("\n Enter your name : ");
            name = input.nextLine();
        }
        System.out.println("Hello " + name.toUpperCase());   // And if the condition becomes false (else), it prints this.
    }
}
