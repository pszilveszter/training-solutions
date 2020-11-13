package objects;

import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args){

        //Példányosíts egy Book objektumot, de ne add értékül semminek! Meg tudod ezt tenni? Hozzá tudsz férni később?
        new Book(); // lehet pédányosítani, de nem lehet kezdeni vele semmit, ott vana a Heap-en mint tű a szénakazlban

        //A System.out.println() metódus paramétereként adj át egy, a paraméterben most példányosított objektumot! Mit ír ki?
        System.out.println("paraméterben példányosított objektum: " + new Book()); // kiírja az objektum generált hivatkozását

        //Deklarálj egy Book típusú emptyBook változót, de ne adj neki értéket, hanem azonnal írd ki az értékét! Fog sikerülni?
        Book emptyBook;
        //System.out.println(emptyBook); // nem lehet fordítani sem, mert nincs inicializálva, kiírni főképp nem lehet

        //Adj neki értéket, méghozzá a null literált! Írasd ki az értékét!
        emptyBook = null;
        System.out.println("epmtyBook null literál értékkel: " + emptyBook); // kiírás = "null", nincs .toString() metódusa!

        //Vizsgáld meg, hogy az emptyBook változó értéke null érték-e! Írd ki a vizsgálat eredményét!
//        if (emptyBook.equals(null)) {
//            System.out.println("emptyBook változó értéke \"null\"");
//        } else {
//            System.out.println("emptyBook változó értéke nem \"null\" hanem hiba: nem lehet meghívni mert a változó maga null");
//        } Nem lehet meghívni, mert az objektum maga null, nincs se attributuma, se metódusai

        //Definiálj egy book nevű változót, és add értékül neki a definíciós utasításban példányosított Book objektumot!
        Book book = new Book();
        //Írasd ki a book változó értékét!
        System.out.println("Új book példány: " + book);
        //Adj neki értékül egy új Book példányt, majd írd ki!
        book = new Book();
        System.out.println("Uyganaz a book változó egy új példánnyal: " + book);

        //Hozz létre egy anotherBook változót, és adj értékül neki egy új Book példányt!
        Book anotherBook = new Book();

        //Hasonlítsd össze egyenlőség operátorral (==) a book és az anotherBook változó értékét, és írd ki az eredményt!
        System.out.println("book és anotherBook összehasonlítás eredménye: " + (book == anotherBook));

        //A anotherBook változó értékéül add a book változó értékét! Írd ki! Hasonlítsd össze egyenlőség operátorral (==) a book és az anotherBook változó értékét, és írd ki az eredményt!
        anotherBook = book;
        System.out.println("anotherBook értéke" + anotherBook.toString());
        System.out.println("book és anotherBook ismételt összehasonlítás eredménye: " + (anotherBook == book));

        //Vizsgáld meg, hogy az anotherBook változó értéke Book típusú-e! Ehhez az instanceof operátort kell használni, azaz System.out.println(anotherBook instanceof Book);
        System.out.println("Book tipusu-e az anotherBook változó: " + (anotherBook instanceof Book));


        //Objektumok száma
        //A következő kód hány objektumot hoz létre? A futás végére mennyi objektumhoz lehet hozzáférni?
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
            //Ellenőrzés
            List<Book> books = Arrays.asList(book1,book2,book3,book4,book5,book6,book7);
            System.out.println("Mennyi book változó van: " + books.size());
            int count = 0;
            for (Book b: books) {
                if (b instanceof Book) {
                    count++;
                }
            }
            System.out.println("Mennyi book példány van: " + count);
        book4 = book5;
        book5 = new Book();
        book6 = null;
            //Ellenőrzés
            books = Arrays.asList(book1,book2,book3,book4,book5,book6,book7);
            System.out.println("A program végén mennyi book változó van: " + books.size());
            count = 0;
            for (Book b: books) {
                if (b instanceof Book) {
                    count++;
                }
            }
            System.out.println("A program végén ennyi book példány van ami hozzáférhető: " + count);

        // 6 objektum jön létre (book1-6) és 5 objektum lesz hozzáférhető (book1-5)
    }
}
