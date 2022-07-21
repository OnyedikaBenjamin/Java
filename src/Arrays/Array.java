 //  Arrays helps us to assign multiple values to a single variable. i.e  int number = 45, 8695, 7;

package Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {


         // An ARRAY is a tray of variables of the same data type.  i.e  int, string.
        // This is the syntax for initializing an array

        String[] names = {"Timi", "Lean", "Benjamin"};   // The number of elements in the braces is the "size of the Array".

        System.out.println(Arrays.toString(names));    // This is the Syntax we use to print an Array, where 'names' is the variable name.

        System.out.println("\n");                    // ..... I need to do some spacing buddy .........

        System.out.println(names.length);          //  This is how we know the size (Length) of an array



        // This is an additional way to write an array

        int[] number = new int[3];                        // "3" in this Syntax represents the amount of numbers "Size or Length of Array".
        number[0] = 67;                                  // Value "67" here is assigned to index 0. All arrays always starts with index 0.
        number[1] = 64;                                 // Value "64" here is assigned to index 1.
        number[2] = 69;                                // Value "69" here is assigned to index 2.

        System.out.println(Arrays.toString(number));


        boolean[] figure = new boolean[4];          // "4" in this Syntax represents the amount of numbers "Size of Array" you want to assign to the variable 'numbers'.
        figure[0] = true;                          // If you assign four numbers in an array of size 3, you will have error notification "Array out of bounds".
        figure[1] = false;
        figure[2] = true;
        figure[3] = false;
        System.out.println(Arrays.toString(figure));





    }
}
