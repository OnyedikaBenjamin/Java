/*   Suppose you want to develop a program to play lottery. The program randomly generates a
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
whether the user wins according to the following rules:

1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
      Note that the digits of a two-digit number may be 0. If a number is less than 10, we assume
the number is preceded by a 0 to form a two-digit number. For example, number 8 is treated
as 08 and number 0 is treated as 00 in the program.*/


 package RandomNumbers;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myLotteryNumber = (int) (Math.random() * 50);    // my lottery number can be anything below 50.
        System.out.println(myLotteryNumber);

        System.out.print("What is your guess number? : ");
        int guessNumber = input.nextInt();

        int guessFirstDigit = guessNumber / 10;       // After dividing a number by 10, our value will be rounded to the nearest int and that gives us the first digit.
        int guessSecondDigit = guessNumber % 10;     //  The remainder after dividing by 10 gives us the second value.

        int myLotteryFirstDigit = myLotteryNumber / 10;
        int myLotterySecondDigit = myLotteryNumber % 10;


        if (guessNumber == myLotteryNumber) {
            System.out.println("You won 10000");
        } else if (guessFirstDigit == myLotterySecondDigit && guessSecondDigit == myLotteryFirstDigit) {
            System.out.println("You won $3000");
        } else if (guessFirstDigit == myLotteryFirstDigit
                || guessFirstDigit == myLotterySecondDigit
                || guessSecondDigit == myLotteryFirstDigit
                || guessSecondDigit == myLotterySecondDigit) {
            System.out.println("You won $1000");
        }
        else {
            System.out.println("Lost!");
        }

    }
}

