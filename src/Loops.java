public class Loops {
    public static void main(String[] args)  {

       int counter = 0;

       while
       (counter < 5) {
           System.out.println(counter);
           counter++;
       }

        System.out.println("printing with for loop");

       for
       (int count = 0; count <= 5; count++){
            System.out.println(count);
        }

        System.out.println("printing with do while loop");
       int numberCount = 0;
       do
       {
           System.out.println(numberCount);
           numberCount++;
       }
       while
       (numberCount < 5);
    }
}
