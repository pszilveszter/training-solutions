package iofilestest.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Book b1 = new Book("Alan Dean Foster","Alien");
    Book b2 = new Book("J.K. Rowling", "Harry Potter");
    Book b3 = new Book("Kövesdán Gábor", "Szoftverfejlesztés JAVA SE platformon");
    Book b4 = new Book("Marc Canter", "Reckless Road - Guns N' Roses");

    private Library lib = new Library();


    @TempDir
    public File folder;


    @Test
    public void addBookTest() {
        lib.add(b2, b3, b2);
        assertEquals(2, lib.getBooks().size());
        Book asserted = lib.getBooks().get(0);
        assertEquals(b2.getAuthor() + ";" + b2.getTitle(), asserted.getAuthor() + ";" + asserted.getTitle());
    }

    @Test
    public void loadBooksTest() throws IOException {
        lib.add(b2, b3);

        Path p = new File(folder, "load.txt").toPath();
        BufferedWriter writer = Files.newBufferedWriter(p);
        writer.write(b1.getAuthor() + ";" + b1.getTitle() + "\n");
        writer.write(b3.getAuthor() + ";" + b3.getTitle() + "\n");
        writer.write(b4.getAuthor() + ";" + b4.getTitle() + "\n");
        writer.close();

        lib.loadBooks(p);

        List<Book> books = lib.getBooks();
        Book asserted = lib.getBooks().get(2);
        assertEquals(4, books.size());
        assertEquals(b1.getAuthor() + ";" + b1.getTitle(), asserted.getAuthor() + ";" + asserted.getTitle());
    }

    @Test
    public void saveBooksTest() throws IOException {
        lib.add(b2, b3, b1);
        Path p = new File(folder, "save.txt").toPath();

        lib.saveBooks(p);

        List<String> books = Files.readAllLines(p);
        assertEquals(3, books.size());
        assertEquals(b2.getAuthor() + ";" + b2.getTitle(), books.get(0));
    }

}