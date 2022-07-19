package SelectionStatements;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int score = input.nextInt();

        for (int grade = 0; grade <= 6; grade++) {

            switch (grade) {

                case 90:
                    System.out.printf("%s%n", "Grade Score is A");
                    break;
                case 60:
                    System.out.printf("%s%n", "The grade Score is B");
                    break;
                case 50:
                    System.out.printf("%s%n", "The grade Score is C");
                    break;
                case 40:
                    System.out.printf("%s%n", "The grade Score is D");
                    break;
                case 30:
                    System.out.printf("%s%n", "The grade Score is E");
                    break;
                default:

                    break;
            }

            // displaying result...
            System.out.println("Your Grade is  = " + grade);
        }
    }
}
