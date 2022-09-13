import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class CustomerTests {
    Customer test;
    Date date;

    @Before
    public void setUp() {
        date = new Date();
        test = new Customer("Bob", 30, 400, 500);
    }

    @Test
    //Test Case for Customer.deposit()
    public void testDeposit() {
        //Create test objects
        test.deposit(400, date, Customer.CHECKING);
        test.deposit(500, date, Customer.SAVING);

        //Test methods to check that amt went into the correct account
        assertEquals("Checking", Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);

        //Test method to check Customer name
        assertEquals("Bob", test.getName());

        //Test method to check that deposit amt is equal to checkBalance when deposited into Checking account
        assertEquals(test.getAmt(), test.getCheckBalance(), 400);

        //Test method to check that deposit amt is equal to savingBalance when deposited into Saving account
        assertEquals(test.getAmt(), test.getSavingBalance(), 500);
    }

    @Test
    //Test Case for Customer.withdraw()
    public void testWithdraw() {
        //Create test objects
        test.withdraw(400, date, Customer.CHECKING);
        test.withdraw(500, date, Customer.SAVING);

        //Test methods to check that amt went into the right account
        assertEquals("Checking", Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);

        //Test method to check Customer name
        assertEquals("Bob", test.getName());

        //Test method to check that withdrawal amt is equal to checkBalance - checkDeposit when withdrawn from Checking account
        assertEquals(test.getAmt(), (test.getCheckBalance() - test.getCheckDeposit()), 400);

        //Test method to check that withdrawal amt is equal to savingBalance - savingDeposit when withdrawn from Saving account
        assertEquals(test.getAmt(), (test.getSavingBalance() - test.getSavingDeposit()), 500);

        //Test method to check overdraft for withdrawal amt
        assertEquals("Overdraft", test.getAmt(), test.getOVERDRAFT(), (test.getAmt()+100));
    }
}