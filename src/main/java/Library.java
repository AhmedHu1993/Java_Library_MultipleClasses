import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.bookStock = new ArrayList<Book>();
        this.capacity = capacity;
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
}
