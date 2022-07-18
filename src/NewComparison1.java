import java.util.Scanner;
    public class NewComparison1 {

        public static void main(String[] args) {

            Scanner calculator = new Scanner(System.in);

            System.out.println("Input the first integer");
            int no1 = calculator.nextInt();

            System.out.println("Input the second integer");
            int no2 = calculator.nextInt();

            System.out.println("Input the Third integer");
            int no3 = calculator.nextInt();

            int Sum = no1 + no2 + no3;
            int Product = no1 * no2 * no3;
            int Average = (no1 + no2 + no3) /3;

            System.out.println("\nThe Sum is: "  + Sum + ", The product is " + Product + " and the Average is " + Average + ".\n");


            if (no1 > no2)
                if (no1 > no3)
                {
                    System.out.print(no1 + " is the largest of the numbers\n");
                }


            if (no2 > no1)
                if (no2 > no3)
                {
                    System.out.print(no2 + " is the largest of the numbers\n");
                }


            if (no3 > no1)
                if (no3 > no2)
                {
                    System.out.print(no3 + " is the largest of the numbers\n");
                }



            if (no1 == no2)
                if (no1 > no3)
                {
                    System.out.print(no1 + " is the largest of the numbers\n");
                }

            if (no1 == no3)
                if (no1 > no2)
                {
                    System.out.print(no1 + " is the largest of the numbers\n");
                }


            if (no2 == no3)
                if (no2 > no1)
                {
                    System.out.print(no2 + " is the largest of the numbers\n");
                }





            if (no1 < no2)
                if (no1 < no3)
                {
                    System.out.print(no1 + " is the smallest of the numbers\n");
                }

            if (no2 < no1)
                if (no2 < no3)
                {
                    System.out.print(no2 + " is the smallest of the numbers\n");
                }

            if (no3 < no1)
                if (no3 < no2)
                {
                    System.out.print(no3 + " is the smallest of the numbers\n");
                }

            if (no1 == no2)
                if (no1 < no3)
                {
                    System.out.print(no1 + " is the smallest of the numbers\n");
                }

            if (no1 == no3)
                if (no1 < no2)
                {
                    System.out.print(no1 + " is the smallest of the numbers\n");
                }


            if (no2 == no3)
                if (no2 < no1)
                {
                    System.out.print(no2 + " is the smallest of the numbers\n");
                }

            if (no1 == no2)
                if (no1 == no3)
                {
                    System.out.print("All numbers are equal");
                }


        }
    }

