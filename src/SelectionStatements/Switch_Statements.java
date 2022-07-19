//SelectionStatements.Switch statements can only be used for simple tasks... you cannot use it for multiple tasks unlike the if else selection statement

package SelectionStatements;

import java.util.Scanner;

public class Switch_Statements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Here, we declared the variable 'score' and assigned its value to whatever the user will input.
        // we can also initialize it and assign a value to it. i.e int score = 7;...
        // in this case, we don't need a scanner to prompt the user

        System.out.println("Enter your score from range 1 - 10");
        int score = input.nextInt();


        switch (score) {

            case (9):
                System.out.println("A");     // If score is >= 9, print A...
                break;
            case (8):
                System.out.println("B");     // If score is >= 8 && <9, print B.
                break;
            case (7):
                System.out.println('C');    // If score is >= 7 && <8, print B.
                break;
            case (6):
                System.out.println("D");
                break;
            case (5):
                System.out.println('E');
                break;
            case (4):
                System.out.println("F");
                break;

            case (3):
                System.out.println("F");
                break;

            case (2):
                System.out.println("F");
                break;

            case (1):
                System.out.println("F");
                break;

            case (0):
                System.out.println("F");
                break;
            default:
                System.out.println("Invalid Score \nPlease input value from 1 - 10");   //  Else print Invalid score.
        }

    }
}


// Just Another Example...

class Switch_Statements2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Here, I created a switch function that reads user input for the day of the week.

        System.out.println("Enter the day of the week");
        String day = input.nextLine();

        switch (day.toUpperCase()) {      // I added a function ".toUpperCase()"  to make all the possible input by the user upper case letters.

            case "Sunday":
                System.out.println("Today is Sunday");
                break;

            case "Monday":
                System.out.println("Today is Monday");
                break;

            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;

            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;

            case "Thursday":
                System.out.println("Today is Thursday");
                break;

            case "Friday":
                System.out.println("Today is Friday");
                break;

            case "Saturday":
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Please input a valid day");


        }
    }
}







