import java.util.Scanner;

public class Sum {

    private int number1;
    private int number2;

    public int addition (){
        return number1 + number2;
    }



    public static void main(String[] args) {

        Sum object1 = new Sum();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        object1.number1= input.nextInt();

        System.out.println("Enter number 2 : ");
        object1.number2 = input.nextInt();

        System.out.println("Therefore the Sum of " + object1.number1 + " and " + object1.number2 + " is : " + object1.addition() );
    }
}
