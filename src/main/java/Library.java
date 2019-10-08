import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private ArrayList<Book> bookStock;
    private int capacity;
    private HashMap<String, Integer> bookGenres;

    public Library(String name, int capacity){
        this.name = name;
        this.bookStock = new ArrayList<Book>();
        this.capacity = capacity;
        this.bookGenres = new HashMap<String, Integer>();
    }

    public String getName(){
        return this.name;
    }

    public int getBookStock() {
        return this.bookStock.size();

    }

    public void addBookToStock(Book book) {

        if (this.bookStock.size() < this.capacity){
            this.bookStock.add(book);
        }
    }

    public void lendBookToBorrower(Borrower borrower, Book book) {
        if (this.bookStock.contains(book)){
            this.bookStock.remove(book);
            borrower.addBookToBorrowedBooks(book);
        }
    }

    public HashMap classifyTheBooksToGenres(){
        for (Book book: this.bookStock){
            if (this.bookGenres.containsKey(book.getGenre())){
                String genre = book.getGenre();
                Integer genreValue = this.bookGenres.get(genre);
              this.bookGenres.put(genre, genreValue + 1);
            } else {
                this.bookGenres.put(book.getGenre(), 1);
            }
        }
        return this.bookGenres;
    }
}
