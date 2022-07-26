import java.util.Scanner;

public class Highest_and_Lowest2 {


    static void practice17() {
        Scanner input = new Scanner(System.in);
        int minimumNumber = 1_000_000_000;
        int maximumNumber = 0;

        int count = 0;

        while (count < 5){
            System.out.println("Enter Numbers ");
            int number = input.nextInt();
            count++;
            if (number < minimumNumber){
                minimumNumber = number;
            }
            if (number > maximumNumber){
                maximumNumber = number;
            }
        }
        System.out.printf("The lowest number is: %d", minimumNumber);
        System.out.println();
        System.out.printf("The largest number is: %d", maximumNumber);
    }


    public static void main(String[] args) {
        practice17 ();
    }
}



