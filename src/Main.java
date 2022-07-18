import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Rows : ");
            // Taking number of stars in a segment
            // as input from user
            int stars = scan.nextInt(), r, c;
            //Outer Loop
            for (r = 1; r < 2 * stars; r++) {
                //Inner loop
                for (c = 1; c < 2 * stars; c++) {
                    if (c == stars || r == c || r + c == 2 * stars)
                        System.out.print(r);
                    else
                        System.out.print(" ");
                }
                //Prints a newline
                System.out.println();
            }
        }
    }

