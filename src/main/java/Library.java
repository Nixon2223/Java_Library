import java.util.ArrayList;

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
}