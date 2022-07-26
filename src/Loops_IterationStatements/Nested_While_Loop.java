// A class of ten students took a quiz. The grades (integers in the range 0–100) for this
// quiz are available to you. Determine the class average on the quiz


package Loops_IterationStatements;
import java.util.Scanner;

public class Nested_While_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalGrades =  0;
        int grades         = -1;

        int counter = 1;

        while (counter<= 10) {                                                     // Condition
            System.out.print("Enter Grade for student " + (counter++) + " : ");   // Enter the grade for student 1..2...3
            grades = input.nextInt();

            while (grades < 0 || grades > 100) {                              // This is the condition!!
                System.out.print("\n Please input value from 0 to 100 : ");
                grades = input.nextInt();
            }
        }
// After the loop.......................................................................

            totalGrades = totalGrades + grades;  // or we say totalGrades += grades


        double average = totalGrades / 10;

        System.out.println("Therefore the average grade of 10 student is : " + average);
    }
}
