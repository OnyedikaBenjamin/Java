package Loops_IterationStatements;// A class of ten students took a quiz. The grades (integers in the range 0–100) for this
// quiz are available to you. Determine the class average on the quiz

import java.util.Scanner;

public class Nested_While_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalGrades =0;
        int counter = 1;
        int grades =-1;

        while (counter<= 10) {
            System.out.print("Enter Grade for student " + (counter++) + " : ");
            grades = input.nextInt();

            while (grades < 0 || grades > 100) {                              // This is the condition!!
                System.out.println("\n Please input value from 0 to 100 : ");
                grades = input.nextInt();
            }
        }

            totalGrades = totalGrades + grades;


        double average = totalGrades / 10;

        System.out.println("Therefore the average grade of 10 student is : " + average);
    }
}
