import Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    @Test

    public void accountCanBeCreatedTest(){

          // Given that account exists
         // Check that account exists
        // Check that balance is equal ot zero

        Account account = new Account();

        assertNotNull(account);
        assertEquals(0, account.getBalance());
    }

    @Test

    public void depositMoney_balanceIncreaseTest(){

        // Given that I have account and balance is equal to zero
        //When I deposit 200
        //Check that balance is 200

        Account bankeAccount = new Account();

        assertEquals(0, bankeAccount.getBalance());
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance());
    }

        @Test

        public void cannotDepositNegativeAmountTest(){

        // given I have an account and my balance is zero
       //  when I try to deposit -2500
      //   Check that balance is equal to zero

        Account bankeAccount = new Account();

        assertEquals(0, bankeAccount.getBalance());
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance());

        }




}
