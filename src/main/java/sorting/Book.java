package sorting;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this.id = id;
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
    public int compareTo(@NotNull Book o) {
        return id - o.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getId() == book.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, author, title);
    }
}
