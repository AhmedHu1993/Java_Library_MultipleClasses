import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBorrowedBooks(){
        return this.borrowedBooks.size();
    }

    public void addBookToBorrowedBooks(Book book){
        this.borrowedBooks.add(book);
    }
}
