import java.util.Scanner;

public class Airlines_dietel719 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int plane[] = new int[10];
        boolean available = false;
        boolean y=true;
        int number, FirstClass = 1, Economy = 6 ;
        String x = "";

        while(FirstClass<=5 && Economy<=10)
        {
            System.out.print("Enter 1 for first class or 2 for Economy or -1 to exit :\t");
            number = input.nextInt();

            if(number==-1)
            {
                break;
            }

            if( number == 1 && FirstClass <= 5 )
            {

                System.out.println("You are assigned to first class\t"+"Seat#"+FirstClass+"\t");
                FirstClass++;


            }


            else if( number == 2 && Economy <=10 )
            {

                //  planeclass[ Economy++ ] = true;

                System.out.println("You are  assigned to Economy class\t" + Economy);
                Economy++;

            }

            else if( number == 1 && FirstClass >= 5 )
            {
                System.out.print("First class full"+"  ");
                if( Economy <= 10)
                {
                    System.out.print("Is it acceptable to be placed in the Economy class (y / n)\t");
                    x = input.nextLine();
                    if (x.equals("y"))
                    {
                        //    planeclass[Economy++ ] = true;

                        System.out.print("Seat reserved in Economy class\t" + Economy);

                    }
                    else
                        System.out.println("Next flight leaves in 3 hours.\t");
                }
            }


            else if( number == 2 && Economy >= 10 )
            {
                System.out.println("Economy class full\t");
                input.nextLine();
                if (x.equals("y"))
                {

                    //    planeclass[ FirstClass++ ] = true;

                    System.out.println("You are  assigned to first class\t"+FirstClass);

                }
                else if(FirstClass==5 && Economy==10)
                {
                    System.out.println("Plane is full, next flight is in 3 hours");
                }
                else
                    System.out.println("Next flight leaves in 3 hours.\t");

            }
            for(int i=1;  i<plane.length;  i++)
            {
                System.out.println(plane[FirstClass] + plane[Economy]);

            }
        }

    }
}
