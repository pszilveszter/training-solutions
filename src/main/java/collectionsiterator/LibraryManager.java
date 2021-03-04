package collectionsiterator;

import java.util.*;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }


    public Book findBookByRegNumber(int regNumber) {
        Iterator<Book> iBooks = libraryBooks.iterator();
        while (iBooks.hasNext()) {
            Book actual = iBooks.next();
            if (regNumber == actual.getRegNumber()) {
                return actual;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }


    public int removeBookByRegNumber(int regNumber) {
        Iterator<Book> iBooks = libraryBooks.iterator();
        while (iBooks.hasNext()) {
            if (regNumber == iBooks.next().getRegNumber()) {
                iBooks.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }


    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> result = new HashSet<>();
        Iterator<Book> books = libraryBooks.iterator();

        while (books.hasNext()) {
            Book b = books.next();
            if (author.equals(b.getAuthor())) {
                result.add(b);
            }
        }

        if (result.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
       return result;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }
}
