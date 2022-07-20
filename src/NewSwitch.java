import java.util.Scanner;

public class NewSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grades = 0;                     // grades entered
        int total  = 0;                    // sum of grades
        int gradeCounter = 0;             // number of grades entered


        int aCount = 0;       // count of A grades
        int bCount = 0;      // count of B grades
        int cCount = 0;     // count of C grades
        int dCount = 0;    // count of D grades
        int fCount = 0;   // count of F grades

         while (input.hasNext()){
                grades = input.nextInt();
               total += grades;
               gradeCounter+=1;


              switch (grades){
                  case 100:
                  case 90:
                      System.out.println("A");
                      break;

                  case 75:
                      System.out.println("B");
                      break;
                  case 65:
                      System.out.println("C");
                      break;
                  case 50:
                      System.out.println("D");
                      break;
                  default:
                      System.out.println("F");
              }


        }

    }
}
