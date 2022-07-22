import java.util.Scanner;

public class EqualityTest {

    private int number1;
    private int number2;


    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        EqualityTest test = new EqualityTest();

        System.out.print("Enter number 1 : ");
        test.number1 = n.nextInt();

        System.out.print("Enter number2 : ");
        test.number2 = n.nextInt();

        if (test.number1 == test.number2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
