import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library{

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (checkHasCapacity()) this.books.add(book);
    }

    public Book removeBook(Book book){
        this.books.remove(book);
        return book;
    }

    public boolean checkHasCapacity(){
        return this.bookCount() < this.capacity;
    }

    public void loan(Book book, Borrower borrower){
        borrower.addBook(this.removeBook(book));
    }

    public Map<String, Integer> countByGenre(){
        HashMap<String, Integer> result;
        result = new HashMap<String, Integer>();
        for (Book book : this.books){
            if (result.containsKey(book.getGenre())) {
                result.put(book.getGenre(), (result.get(book.getGenre())) + 1);
            }else{
                result.put(book.getGenre(), 1);
            }
        }
        return result;
    }
}