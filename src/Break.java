import java.util.Arrays;

public class Break {

    public static void main(String[] args) {

        String[] namesTray = {"false", "hey", "fh", "true"};

        for (String name : namesTray) {
            if (name.equals("fh"))
                break;

            System.out.println(name);

            System.out.println();                       // I just need to do some spacing buddy...

            int[] numbersTray = {34, 33, 38, 39, 83};

            for (int num : numbersTray) {
                if (num == 39)
                    break;
                System.out.println(num);
            }

        }
    }
}
