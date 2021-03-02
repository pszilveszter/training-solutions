package collectionsequalshash;

import java.util.*;

public class BookCatalog {


    public Set<Book> addBooksToSet(Book[] sameBooks) {
        Set<Book> uniqueBooks = new HashSet<>();
        Collections.addAll(uniqueBooks, sameBooks);
        return uniqueBooks;
    }

    public Book findBook(List<Book> books, Book searchingFor) {
        if (books.contains(searchingFor)) {
            for (Book b: books) {
                if (searchingFor.equals(b)) {
                    return b;
                }
            }
        }
        return null;
    }

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchingFor = new Book(title, author);
        if (books.contains(searchingFor)) {
            for (Book b: books) {
                if (searchingFor.equals(b)) {
                    return b;
                }
            }
        }
        return null;
    }
}
