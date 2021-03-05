package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }


    public List<Book> orderedByTitle() {
        List<Book> byTitle = new ArrayList<>(libraryBooks);
        Collections.sort(byTitle);
        return byTitle;
    }


    public List<Book> orderedByAuthor() {
        List<Book> byAuthor = new ArrayList<>(libraryBooks);
        byAuthor.sort(new AuthorComparator());
        return byAuthor;
    }


    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> byLocalTitle = new ArrayList<>();
        for (Book b: libraryBooks) {
            byLocalTitle.add(b.getTitle());
        }
        byLocalTitle.sort(Collator.getInstance(locale));
        return byLocalTitle;
    }
}
