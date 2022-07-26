import java.util.Scanner;

public class HighestAndLowest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        System.out.println("Enter third number");
        int number3 = input.nextInt();

        System.out.println("Enter fourth number");
        int number4 = input.nextInt();

        System.out.println("Enter fifth number");
        int number5 = input.nextInt();


        System.out.println ("The maximum number is : "+ Math.max(number5, (Math.max(number4, Math.max(number3, Math.max(number1, number2))))));
        System.out.println ("The minimum number is : "+ Math.min(number5, (Math.min(number4, Math.min(number3, Math.min(number1, number2))))));

    }
}

