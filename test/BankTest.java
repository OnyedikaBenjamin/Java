import Account.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankTest {

    private Bank wemaBank;

  @BeforeEach
  public void startupwiththis(){
      Bank wemaBank = new Bank();
  }

    @Test

    public  void bankExistsTest(){
        assertNotEquals(null, wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest(){
      // when i create an account
        // check that number of account created is 1

    }
}
