import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testBookHasTitle(){
        Book book1 = new Book("Macbeth", "Shakespeare","Tragedy");
        assertEquals("Macbeth", book1.getTitle());
    }

}
