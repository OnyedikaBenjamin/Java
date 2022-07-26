import java.util.Scanner;

public class Highest_and_Lowest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1");
        int user_input = input.nextInt();

        int lowest_number = user_input;

        int largest_Number = user_input;

        int count = 1;

        while (count < 5){
            System.out.println("Enter number " + (count+1));
            user_input = input.nextInt();

            int user_input_is_larger = Math.max(user_input , largest_Number);

            int user_input_is_lower = Math.min(user_input, lowest_number);

            if (user_input > largest_Number){
            largest_Number = user_input;
            }
            if (user_input > largest_Number){
                lowest_number = user_input;
            }
            count++;
        }
            System.out.println("The largest number is : " + largest_Number);
            System.out.println("The lowest number is : " + lowest_number);





    }
}
