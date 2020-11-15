package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Kezdő Java programozás");
        System.out.println(book.getTitle());
        book.setTitle("Haladó Java programozás");
        System.out.println(book.getTitle());
    }

}
