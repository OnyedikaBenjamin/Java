package Loops_IterationStatements;

import java.util.Scanner;

public class Nested_For_Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int no_of_Rows ;
        int no_of_columns;
        String symbol = "";

        System.out.println("Enter the number of rows : ");
        no_of_Rows = input.nextInt();


        System.out.println("Enter the number of columns : ");
        no_of_columns = input.nextInt();

        input.nextLine();     // We use this code to tell the compiler that we are converting from int to string.

        System.out.println("Enter the type of symbol to use : ");
        symbol = input.nextLine();

        for (int i =0 ; i<no_of_Rows; i++){
            System.out.println();                    // This code is needed when we are doing a nested for loop iteration
            for (int j =0 ; j<no_of_columns ; j++) {
            System.out.print(symbol);
           }
        }


    }
}
