import java.util.Scanner;

public class Setters_Getters2 {
    private String name;
    private double balance;

    public Setters_Getters2(String accountName , double balance) {  // here we created a constructor so we can create new instance of the class.
        this.name = accountName;

        if (balance > 0.0) {          // we also placed a conditional statement that implies if its valid, assign the new balance to the instance variable "balance".
            this.balance = balance;
        }
    }
 public void deposit(double depositAmount) {                 // method that deposits (adds) only a valid amount to the balance
        if (depositAmount > 0.0) {                           // if the deposit is valid,
            this.balance = balance + depositAmount;          // add it to the balance
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }





    public static void main(String[] args) {               // here i did not introduced the drivers class, i did both on the same class file.

        Scanner input = new Scanner(System.in);

        Setters_Getters2 account1 = new Setters_Getters2("initialName" ,60.00 );
        Setters_Getters2 account2 = new Setters_Getters2("initialName" ,80.00);

        System.out.println("Account 1 initial balance is $" + account1.getBalance() +  " while account 2 initial balance is $" + account2.getBalance());

        System.out.println("enter the name of the first account");
        String theNewName = input.nextLine();
        account1.setName(theNewName);

        System.out.println("enter the name of the second account");
        String theNewName2 = input.nextLine();
        account2.setName(theNewName2);

        System.out.println("The first account name is " + account1.getName());
        System.out.println("The first account name is " + account2.getName());


        System.out.println("enter the balance of Account " + account1.getName());
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("enter the balance of Account " + account2.getName());
         depositAmount = input.nextDouble();   //here is interesting..... "double" have already been defined in previous statement so we dont need to show its data type again
        account2.deposit(depositAmount);


       // System.out.println(Account1.getName() + "balance is $" + Account1.getBalance() );   NOTE!!!!! printing with "println does not work at this case ooo ah..
        System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance() ); //printing with "printf"
        System.out.printf("%s balance: $ %.2f %n", account2.getName(), account2.getBalance() ); //printing with "printf"



    }
}
