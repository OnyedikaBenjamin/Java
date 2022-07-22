
  //      Create a function that returns true when num1 is equal to num2; otherwise return false.
//  Examples:
//  isSumNum(4,8) -> false
//  isSumNum(2,2) -> true




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
