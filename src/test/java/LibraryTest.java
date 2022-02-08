import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("title1", "author1", "genre1");
        borrower = new Borrower();
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void cantAddBookIfNoCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5,library.bookCount());
        assertFalse(library.checkHasCapacity());
    }

    @Test
    public void canLoanBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.loan(book, borrower);
        library.loan(book, borrower);
        assertEquals(1,library.bookCount());
        assertEquals(2,borrower.bookCount());
    }
}
