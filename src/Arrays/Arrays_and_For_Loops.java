package Arrays;

import java.util.Arrays;

public class Arrays_and_For_Loops {

    public static void main(String[] args) {

        String[] houses = {"Duplex", "Semi-detached", "Bungalow", "Mansion", "Sky-scrapper"};  // Here we initialized an Array
        System.out.println(Arrays.toString(houses) + "\n"); // Here we just printed the Array

        for (int i = 0; i < houses.length; i++){          // Here we stated that it should loop from index 0 to index 4
            System.out.println(houses[i]);               // Here we print out the values of the array with loop condition.
        }

    }
}
