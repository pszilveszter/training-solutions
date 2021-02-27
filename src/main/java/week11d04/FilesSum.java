package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i< 100; i++) {
            String name = i < 10 ? "0" + i: Integer.toString(i);
            Path file = Path.of("week11d04").resolve("number" + name + ".txt");
            if(Files.isRegularFile(file)) {
                try {
                    sum += Integer.parseInt(Files.readString(file));
                } catch (IOException ioe) {
                    throw new IllegalStateException("Unable to read file " + file, ioe);
                }
            }
        }
        return sum;
    }

}
