package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void loadFromFile() {
        try (Scanner rb = new Scanner(this.getClass().getResourceAsStream("books.csv"))) {
            rb.useDelimiter(";|(\r\n)");
            while (rb.hasNextLine()) {
                Book book = new Book(rb.next(), rb.next(), rb.next(), rb.nextInt());
                books.add(book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
