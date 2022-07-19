// Use a for statement to sum the even integers from 2 to 20 and store the result in an int variable called total.

public class IntegerSum {
    public static void main(String[] args) {

        int total = 0;

        System.out.println("The even integers from 2 to 20 are : ");

        for (int counter = 20; counter >= 2; counter-=2){
            System.out.println(counter);
            total += counter;              // Instead of saying total = total + counter
        }

        System.out.println("Therefore the sum of the integers from 2 to 20 is : " + total);



    }

}
