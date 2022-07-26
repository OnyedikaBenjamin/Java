package Loops_IterationStatements;

public class For_Loop {

    public static void main(String[] args) {

          // Unlike the While and do while loop, the for loop can limit the number of times a True condition will execute
         // It has 3 phase,
        // Initialization phase "counter=0",  Condition phase "counter <10", Increment or Decrement phase "counter++".


        int counter;                                     // i declared my local variable "Counter".

        for (counter = 0;  counter <10; counter++){   // I incremented(++) my counter to start from 0 and to end @ <10
            System.out.println(counter);
        }

        System.out.println();          // I just need to do some spacing buddy



        int minusCount;                                     // i declared my local variable "minusCount".

        for (minusCount = 7;  minusCount >= 0; minusCount--)   // I decremented my counter to countdown from 7 to 0.
        {
            System.out.println(minusCount );
        }


        // Another Example

        int count;                                // I declared my counter
        int years = 24;                          //  I initialized my years

        for (count = 2;  count <=12; count++)  // I told my counter to print the Statement below 10 times.
        {
            System.out.println("\tI will be " + (count + years) + " years old in the next " +  count + " years");
        }
    }
}