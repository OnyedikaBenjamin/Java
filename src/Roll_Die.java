import java.security.SecureRandom;

public class Roll_Die {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        // We first initialized our
        int frequency1 =0;
        int frequency2 =0;
        int frequency3 =0;
        int frequency4 =0;
        int frequency5 =0;
        int frequency6 =0;

        for (int roll = 1; roll <= 60_000_000; roll++){
            int face= 1 + randomNumbers.nextInt(6);

            switch (face) {

                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;

            }
        }

//        System.out.println("Face \t\t Frequency");
//        System.out.println("1 \t\t"+ frequency1);
//        System.out.println("2 \t\t"+ frequency2);
//        System.out.println("3 \t\t"+ frequency3);
//        System.out.println("4 \t\t"+ frequency4);
//        System.out.println("5 \t\t"+ frequency5);
//        System.out.println("6 \t\t"+ frequency6);


        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);

    }
}
