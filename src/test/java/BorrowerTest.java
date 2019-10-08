import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void setup(){
        borrower = new Borrower("Dola");
    }

    @Test
    public void testBorrowerHasName(){
        assertEquals("Dola", borrower.getName());
    }
}
