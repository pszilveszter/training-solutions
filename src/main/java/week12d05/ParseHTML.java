package week12d05;

import java.io.BufferedReader;
import java.io.IOException;

public class ParseHTML {

    public int countExpressionFromFile(String expression, BufferedReader reader) {
        int countAll = 0;
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                countAll += countString(expression, line.toLowerCase());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file ", ioe);
        }
        return countAll;
    }


    private int countString(String expression, String line) {
        int count = 0;
        int foundAt = 0;
        while ((foundAt = line.indexOf(expression, foundAt + 1)) > -1) {
            count++;
        }
        return count;
    }
}
