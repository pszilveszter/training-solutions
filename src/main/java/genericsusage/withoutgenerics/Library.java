package genericsusage.withoutgenerics;

import java.util.List;

public class Library {

    public Book getFirstBook(List books) {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        try {
            return (Book) books.get(0);
        }
        catch (ClassCastException cce) {
            throw new ClassCastException("Not a book");
        }
    }
}
