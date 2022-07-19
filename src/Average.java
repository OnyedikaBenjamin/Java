import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        int noOfStudents =0;
        double totalGrade =0;


        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in the class?");
        noOfStudents = input.nextInt();


        for (int count = 1;  count <= noOfStudents; count++) {

            System.out.println("Enter the grade of student " + count);
            double grade = input.nextDouble();

            while (grade < 0 || grade > 100) {
                System.out.println("Please! \n\t Enter a grade from 0 - 100");
                 grade = input.nextDouble();
            }

            totalGrade = totalGrade + grade;
        }



        System.out.println("\nThe total grade is : " + totalGrade);



        double average = totalGrade / noOfStudents;

        if (average > 100){
            System.out.println("Please check your students input, Average cannot be greater than 100");
        }
        else {
            System.out.println("\nThe Average grade of " + noOfStudents + " Students is : " + Math.floor(average));


        if (average >= 85) {
            System.out.println("What an insurmountable and indecipherable sinequanon Pedagogue!!!!");
        }
        else if (average >= 75) {
            System.out.println("A excellent first class teacher!!");
        }
        else if (average >= 65)  {
            System.out.println("A very good teacher!");
        }
        else if (average >= 55)  {
            System.out.println("A normal teacher");
        }
        else if (average >= 45){
            System.out.println("This teacher needs to improve");
        }
        else {
            System.out.println("Hey thingamabob!!!!\n" +
                    "\tYou are fired!!!!!!");
        }

    }



    }
}
