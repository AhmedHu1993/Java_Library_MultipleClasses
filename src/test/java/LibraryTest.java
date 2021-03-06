import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Library library;
    private Borrower borrower;

    @Before
    public void setUp(){
        book1 = new Book("Macbeth", "Shakespeare","Tragedy");
        book2 = new Book("Hamlet", "Shakespeare","Tragedy");
        book3 = new Book("The Prisoner Of Zenda", "Anthony Hope", "Adventure");
        book4 = new Book("Oliver Twist","Charles Dickens", "Social");
        book5 = new Book("David CopperField","Charles Dickens", "Social");
        library = new Library("The Central Library", 5);
        borrower = new Borrower("Doola");

        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        library.addBookToStock(book4);
        library.addBookToStock(book5);
    }

    @Test
    public void testLibraryHasTitle(){
        assertEquals("The Central Library", library.getName());
    }

    @Test
    public void testLibraryStock(){
        assertEquals(5, library.getBookStock());
    }

    @Test
    public void testCanAddIfMaxCapacityReached(){
        Book book6 = new Book("title", "author", "genre");
        library.addBookToStock(book6);
        assertEquals(5, library.getBookStock());
    }

    @Test
    public void testLibraryCanLendBookToBorrower(){
        library.lendBookToBorrower(borrower, book2);
        assertEquals(1, borrower.getNumberOfBorrowedBooks());
        assertEquals(4, library.getBookStock());
    }

    @Test
    public void testLibraryHasHashMapOfGenres(){
        HashMap booksHash = library.classifyTheBooksToGenres();
        assertEquals(2, booksHash.get("Social") );
    }
}
