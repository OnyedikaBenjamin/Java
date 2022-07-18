package Loops_IterationStatements;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String myName;
//        System.out.println("What is your name: ");
//        myName = input.nextLine();

        //while loop

//        while (myName.equals("BEN")) {
//            System.out.println("My name is BEN");

//            System.out.println("What is your name: ");
//            myName = input.nextLine();
//        }

            // do while loop
        do{
            System.out.println("MY NAME IS BEN");

            System.out.println("What is your name: ");
            myName = input.nextLine();

        }while(myName.equals("BEN"));
        System.out.println("name is taken");

            // for loop

//        for ( int i = 1; i <= 1000;i++){
//            System.out.println(i + " times");
//        }

            // for loop in an array

//            int[] ages = {10, 38, 28, 29, 82, 82};
//            for (int i = 0; i < ages.length; i++) {
//                System.out.println("Age at " + i + " is " + ages[i]);
//            }


        }


    public static class For_Loops {

        public static void main(String[] args) {

            int[] number = {2, 43, 0, 22, 38};

            for (int i = 0; i < number.length; i++) {
                System.out.println(i);

            }

        }
    }
}

