// it allows the user to enter 10 grades, then calculates and displays the average.

import java.util.Scanner;

public class While3 {
    private int totalGrade;
    private int nOfStudent = 10;

    private double average = totalGrade / nOfStudent;

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int count = 0;
    while (count < 10) {
        System.out.println("Enter grade");
        int grade = input.nextInt();
        count++;
    }

    }
}
