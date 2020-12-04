package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        int sum = 0;
        if (isEmpty(delimiter)) {
            sum = readAndSumValues(intString);
        } else {
            Scanner sc = new Scanner(intString).useDelimiter(delimiter);
            while (sc.hasNext()) {
                try {
                    sum += sc.nextInt();
                }
                catch (InputMismatchException ime) {
                    throw new IllegalArgumentException("Incorrect parameter string!");
                }
            }
            sc.close();
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        Scanner sc = new Scanner(intString);
        int sum = 0;
        while (sc.hasNext()) {
            try {
                sum += sc.nextInt();
            }
            catch (InputMismatchException ime) {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        sc.close();
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text) || word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner input = new Scanner(text);
        StringBuilder output = new StringBuilder();
        while (input.hasNextLine()) {
            String t = input.nextLine();
            if (t.contains(word)) {
                output.append(t);
                output.append("\n");
            }
        }
        input.close();
        return output.toString().strip();
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}
