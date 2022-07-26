public class Multiplication_Table {


    public static void main(String[] args) {

        int row;
        int column;

        System.out.println("\t\t Multiplication Table");

        for (row = 1; row <= 9; row++) {
            System.out.print("\t" + row);
        }
        System.out.print("\n----------------------------------------\n");

        for (column = 1; column <= 9; column++)
            System.out.println(column + "|" + "\t" );


    }
}


