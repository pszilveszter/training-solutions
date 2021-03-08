package sorting;

import java.util.*;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        Iterator<Book> iLib = library.iterator();
        if (!iLib.hasNext()) {
            throw new NullPointerException("Libray is empty!");
        }
        Set<Book> orderedCopy = new TreeSet<>(library);
        return orderedCopy.iterator().next();

    }
}
