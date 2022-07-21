import java.util.Scanner;

public class Minutes_Seconds {

    private int minutes;
    private int seconds;

    public void setMinutes(){
            this.minutes = minutes;
        }


    public void setSeconds(){
        this.seconds = seconds;
    }

//    public int getMinutes() {
//        return minutes;
//    }

    public int getSeconds() {
        return minutes * 60;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Minutes_Seconds convert = new Minutes_Seconds();

        System.out.println("Enter the time in minutes");
        convert.minutes = input.nextInt();

        System.out.println(" the minutes is equal to " + convert.getSeconds() + " seconds");

    }
}