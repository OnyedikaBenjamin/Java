package Account;

public class Account {

    private int balance;
    public int getBalance(){
        return balance;
    }

    public void deposit(int amount) {
      if (amount > 0) balance = getBalance() + amount;
    }

}
