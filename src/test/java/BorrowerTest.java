import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before() {
        library = new Library(5);
        borrower = new Borrower();
    }

    @Test
    public void canCountCollection(){
        assertEquals(0, borrower.bookCount());
    }
}
