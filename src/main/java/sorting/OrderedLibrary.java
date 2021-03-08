package sorting;

import java.util.*;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        Iterator<Book> iLib = library.iterator();
        if (iLib.hasNext()) {
            return iLib.next();
        }

        throw new NullPointerException("Libray is empty!");
    }
}
