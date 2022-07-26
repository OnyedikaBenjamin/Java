package Loops_IterationStatements;

import java.util.Scanner;

public class Nested_For_Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfRows;               // We declared 3 local variables namely 'numberOfRows', 'numberOfColumns' and 'symbol'.
        int numberOfColumns;
        String symbol = "";

        System.out.println("Enter the number of rows : ");
        numberOfRows = input.nextInt();


        System.out.println("Enter the number of columns : ");
        numberOfColumns = input.nextInt();

        input.nextLine();     // We use this code to tell the compiler that we are converting from int to string.

        System.out.println("Enter the type of symbol to use : ");
        symbol = input.nextLine();

        for (int i =0 ; i<numberOfRows; i++){         // 'i' is less than the number of rows the user inputs.
            System.out.println();                    // This code is needed when we are doing a nested for loop iteration
            for (int j =0 ; j<numberOfColumns ; j++) {
            System.out.print(symbol);
           }
        }


    }
}
