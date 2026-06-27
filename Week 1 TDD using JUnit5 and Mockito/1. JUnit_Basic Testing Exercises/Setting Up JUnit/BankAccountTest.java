import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        assertEquals(1500, account.deposit(500));
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount();
        assertEquals(800, account.withdraw(200));
    }

    @Test
    public void testCheckBalance() {
        BankAccount account = new BankAccount();
        assertEquals(1000, account.checkBalance());
    }

    @Test
    public void testHasSufficientBalance() {
        BankAccount account = new BankAccount();
        assertTrue(account.hasSufficientBalance(500));
    }

    @Test
    public void testInsufficientBalance() {
        BankAccount account = new BankAccount();
        assertFalse(account.hasSufficientBalance(1500));
    }

    @Test
    public void testMultipleTransactions() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(300);
        assertEquals(1200, account.checkBalance());
    }
}