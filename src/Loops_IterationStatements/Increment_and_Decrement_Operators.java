package Loops_IterationStatements;

public class Increment_and_Decrement_Operators {

    public static void main(String[] args) {
        int friends = 20;                          // Here we declared a local variable and assigned it to a value of 10.
       friends = friends + 1;                     // We just increased the value of friends by 1.
        System.out.println("I have " + friends + " Friends.");



          // Using the increment Operator (++) or (+=), An easier approach to increase the value of an Apple,
         // we only use the "++" operator if we want to increment by 1
        //  we use the "+=" operator if we want to increment by 2 or more.

       int Apple = 5;                          // We declared another local variable "Apple" and assigned its value to 5.
        Apple++;
        System.out.println("I have " + Apple + " Apples.");


        int Mango = 10;                          // We declared another local variable "Mango" and assigned its value to 5.
        Mango+=2;                               // Instead of saying Mango = Mango + 2
        System.out.println("I have " + Mango + " Mango.");




        // The Decrement operator (--) or (-=), only reduces the value, unlike the increment operator.

        int Orange = 15;
        Orange-=5;
        System.out.println("I have " + Orange + " Oranges.");


    }
}
