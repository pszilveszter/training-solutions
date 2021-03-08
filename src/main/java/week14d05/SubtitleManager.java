package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class SubtitleManager {


    public Map<String, Integer> countWords(Path file, String... words) {
        Map<String, Integer> stats = addKeys(words);

        try (BufferedReader br = Files.newBufferedReader(file)) {
            processLine(stats, br, words);
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + file, ioe);
        }
        return stats;
    }


    private Map<String, Integer> addKeys(String... keys) {
        Map<String, Integer> stats = new TreeMap<>();
        for (String k: keys) {
            stats.put(k, 0);
        }
        return stats;
    }


    private void processLine(Map<String, Integer> stats, BufferedReader br, String[] words) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.matches("[\\d]") && !line.matches("")) {
                fillMap(stats, line, words);
            }
        }
    }


    private void fillMap(Map<String, Integer> stats, String line, String... words) {
        for (String k : words) {
            if (line.contains(k)) {
                int i = stats.get(k);
                stats.replace(k, ++i);
            }
        }
    }
}