/*Consider a program segment that
 finds the first power of 3 larger than 100. After the following while statement executes,
 product contains the result:*/

public class While2 {

    public static void main(String[] args) {

        int count = 3;

        while (count <= 100) {
            count = count * 3;
            System.out.println("The product is : " + count);
            count++;
        }

    }
}