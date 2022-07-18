package SelectionStatements;//Writing a Two way If-Else Statement
import java.util.Scanner;
public class If_SingleSelectionStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Exam score");
        int score = input.nextInt();

        if (score > 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }


        // The selection statement can also be written this way below

        System.out.println(score > 60? "Passed" : "Failed");  // This is what is called the conditional or Tenary Operator

    }
}


