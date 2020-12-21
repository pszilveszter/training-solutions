package objectclass;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        if (isEmpty(author)) {
            throw new IllegalArgumentException("Book author must be given!");
        }
        if (isEmpty(title)) {
            throw new IllegalArgumentException("Book title must be given!");
        }
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return author + " / " + title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book b = (Book) obj;
        if (isEmpty(b.author) || isEmpty(b.title) || !author.equals(b.author) || !title.equals(b.title)) {
            return false;
        }
        return true;
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}
