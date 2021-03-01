package genericsusage.withgenerics;

import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null || books.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        return books.get(0);
    }


}
