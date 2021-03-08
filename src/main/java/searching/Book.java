package searching;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this(author, title);
        this.id = id;
    }

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, author, title);
    }

    @Override
    public int compareTo(Book o) {
        if (author.compareTo(o.author) == 0) {
            return title.compareTo(o.getTitle());
        }
        return author.compareTo(o.author);
    }
}
