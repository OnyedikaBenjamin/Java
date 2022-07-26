package RandomNumbers;

public class RandomNumbers1 {

    public static void main(String[] args) {

        int myRandomNumber;                             // I declared a local variable

        myRandomNumber =(int) (Math.random() * 100);
        // In the function above, we say that the random number should be lesser than 100,
        // and the user input should be cast to the nearest int because "myRandomNumber" is of int data type.

        System.out.println("My random number is : " + myRandomNumber);



        // We can also make our condition tighter by saying....

        int myRandomNumber2;

        myRandomNumber2 = 50 + (int) (Math.random() * 50);        // This will return a value between 50 and 99.
        System.out.println("My second random number is : " + myRandomNumber2);


    }
}
