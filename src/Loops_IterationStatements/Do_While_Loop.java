package Loops_IterationStatements;

import java.util.Scanner;

public class Do_While_Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


          // Unlike the While loop, the do-While loop will first execute a block of code once
         // before it checks the condition and if the condition remains true, it keeps executing
        //  the statement in the do_loop until the condition becomes false.

        String name;

        do {
            System.out.println("My designation here is ben,");
            System.out.println("\tChoose your own designation : ");
            name = input.nextLine();
        }
         while (name.equals("ben"));
        System.out.println("Welcome " + name + "!");   // And when the condition becomes false, it prints this.


    }
}