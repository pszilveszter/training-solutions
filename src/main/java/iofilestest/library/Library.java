package iofilestest.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void add(Book... books) {
        for (Book b: books) {
            if (isNew(b)) {
                this.books.add(b);
            }
        }
    }

    public void saveBooks(Path path) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book: books) {
                writer.write(book.getAuthor());
                writer.write(";");
                writer.write(book.getTitle());
                writer.newLine();
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file " + path, ioe);
        }

    }

    public void loadBooks(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                add(new Book(data[0], data[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file" + path, ioe);
        }
    }

    private boolean isNew(Book b) {
        for (Book book: books) {
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
                return false;
            }
        }
        return true;
    }
}
