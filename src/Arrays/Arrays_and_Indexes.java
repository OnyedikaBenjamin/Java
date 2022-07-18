package Arrays;

public class Arrays_and_Indexes {

    public static void main(String[] args) {

        // If we want to get/access an index from a String Array below,
        String[] name = {"Timi", "Lean", "Benjamin"};

        String Champion = name[2];
        System.out.println(Champion);             // We print out the value at index 2

        String IstRunnerUp = name[1];
        System.out.println(IstRunnerUp);        // We print out the value at index 1

        String SecondRunnerUp = name[0];
        System.out.println(SecondRunnerUp);    // We print out the value of index 0


        // We can also get/access an index from an int Array below
        int[] number = {67, 64, 69, 78, 48, 364, 347, 843,84, 43, 48};

        int  timiAge = number[0];
        int  leanAge = number[1];
        int  benjaminAge = number[8];

        System.out.println("The value at index 0 is : " + timiAge + ", The value at index 1 is : " + leanAge + ", The value at index 2 is : " + benjaminAge);
        System.out.println(number.length);

        // We can also get/access an index from a boolean Array below
        boolean[] Benjamin = {true, false, true};

        boolean handsome = Benjamin[0];
        boolean tall = Benjamin[1];
        boolean goodSenseOfHumour = Benjamin[2];

        System.out.println("The value at index 0 is : " + handsome + ", The value at index 1 is : " + tall + ", The value at index 2 is : " + goodSenseOfHumour);

        // We can also change the values in our array

        String []cars = {"BMW" , "Honda" , "Tesla"};
        cars[0] = "Volvo";                              // Here we changed the value at index 0 to "Volvo".
        System.out.printf(cars[0]);                    //  Here we printed the value at index 0.
    }
}
