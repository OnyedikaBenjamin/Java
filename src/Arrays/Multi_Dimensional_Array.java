package Arrays;

import java.util.Arrays;

public class Multi_Dimensional_Array {

    public static void main(String[] args) {

        // Unlike our normal array, Multi-dimensional array deals with rows and columns.

        String[][] Cars = {                                                             //Here we declared a multidimensional array of 4 rows and 3 columns.
                           {"Honda",       "RoyceRoys",   "Tesla",     "Lexus     "},
                           {"Bugatti",     "Chevrolet",   "Mercedes",  "Highlander"},
                           {"LandCruiser", "Jeep     ",   "Venza",     "Sienna    "}
                          };

        System.out.println("");

        for (int i = 0; i < Cars.length; i++) {
            System.out.println();
            for (int j =0; j < Cars[i].length; j++) {
                System.out.print(Cars[i][j] + "\t\t\t");                    // We used the "\t\t\t" to configure spaces in our print-out.
            }
        }



        // This is just another way to write our multidimensional array.

        String [][] Car = new String[4][3];  // Here we declared a multidimensional array with 5 rows and 3 columns.

        Car [0][0] = "Honda";
        Car [0][1] = "RoyceRoys";
        Car [0][2] = "Tesla";
        Car [1][0] = "Lexus";
        Car [1][1] = "Bugatti";
        Car [1][2] = "Chevrolet";
        Car [2][0] = "Mercedes";
        Car [2][1] = "Highlander";
        Car [2][2] = "LandCruiser";
        Car [3][0] = "Jeep       ";
        Car [3][1] = "Venza      ";
        Car [3][2] = "Sienna     ";

        for (int i = 0; i < Car.length; i++) {
            System.out.println();
            for (int j =0; j < Car[i].length; j++) {
                System.out.print(Car[i][j] + "\t\t\t");
            }
        }


    }


}
