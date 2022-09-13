import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class DepositTests {
    Deposit test;
    Date date;

    @Before
    public void setUp() {
        date = new Date();
        test = new Deposit(400, date,"Checking");
        test = new Deposit(500, date,"Saving");
    }

    @Test
    //Test Case for Deposit.toString()
    public void testToString() {
        //Test methods to check that amt went into the correct account
        assertEquals("Checking", Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);
    }
}