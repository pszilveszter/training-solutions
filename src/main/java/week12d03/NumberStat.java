package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    public void loadFromFile(Path path) {
        if (Files.isDirectory(path)) {
            throw new IllegalStateException("Unable to read file " + path);
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                for (String s: data) {
                    numbers.add(Integer.parseInt(s));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + path, ioe);
        }
    }


    public int lowestUniqueNumber() {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalStateException("Bad input " + numbers);
        }

        Collections.sort(numbers);
        for (int n: numbers) {
            if (numbers.indexOf(n) == numbers.lastIndexOf(n)) {
                return n;
            }
        }
        throw new IllegalStateException("No unique integer");
    }
}
