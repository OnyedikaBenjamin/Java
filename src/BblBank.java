import java.util.Scanner;

public class BblBank {
    private String name;
    private double balance;

    public BblBank(String name, double balance) {
        this.name = name;

        if(balance > 0.0)
        {
            this.balance = balance;
        }
    }

    public void changeTheName(String name) {
        this.name = name;
    }

    public void deposit (int depositAmount){
        if (depositAmount <= 0) {
            System.out.println("You cannot deposit less than $1");
        }
        else {
            this.balance = balance + depositAmount;
        }
    }

    public void Withdraw (int withdrawAmount){
        if (withdrawAmount > balance){
            System.err.println("Insufficient funds");
        }
        else if (withdrawAmount > 0) {
            this.balance = balance - withdrawAmount;
        }
    }



    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BblBank customer1 = new BblBank("No name" , 0.00);
        System.out.println("The initial name for customer1 is : " + customer1.getName() +
                           ", The initial balance of customer1 is : $" + customer1.getBalance());

        System.out.println("\nEnter name for customer1");
        String name = input.nextLine();
        customer1.changeTheName(name);

        System.out.println("Welcome " + customer1.getName() + "! \n Please enter the amount you wanna deposit");
        int depositAmount = input.nextInt();
        customer1.deposit(depositAmount);

        System.out.println("Enter withdrawal amount");
        int withdrawalAmount = input.nextInt();
        customer1.Withdraw(withdrawalAmount);

        System.out.println(customer1.getName() + " balance is : $" + customer1.getBalance());
//----------------------------------------------------------------------------------------------------------------------

//        if we had say customer1.changeTheName("Bola"),  it would have changed the name to bola

    }

}


