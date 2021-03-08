package searching;

import java.util.Arrays;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }


    public Book findBookByAuthorTitle(String author, String title) {
        if (isEmpty(author)) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        Book[] searchIn = Arrays.copyOf(bookArray, bookArray.length);
        Arrays.sort(searchIn);
        int index = Arrays.binarySearch(searchIn, new Book(author, title));

        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return searchIn[index];
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}
