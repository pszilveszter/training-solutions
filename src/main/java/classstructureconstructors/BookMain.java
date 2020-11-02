package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        System.out.println("Kövesdán Gábor - Szoftverfejlesztés Java SE platformon című könyv regisztrációja");
        Book book = new Book("Kövesdán Gábor","Szoftverfejlesztés Java SE platformon");

        System.out.println("Regisztráció előtti adatok");
        System.out.println("\tSzerző: " + book.getAuthor());
        System.out.println("\tCím: " + book.getTitle());
        System.out.println("\tRegisztrációs szám: " + book.getRegNumber());

        String regNumber = "ISBN9786150029337";
        book.register(regNumber);

        System.out.println("Regisztráció utáni adatok");
        System.out.println("\tSzerző: " + book.getAuthor());
        System.out.println("\tCím: " + book.getTitle());
        System.out.println("\tRegisztrációs szám: " + book.getRegNumber());

    }
}
