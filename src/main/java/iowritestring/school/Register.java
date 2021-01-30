package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int mark) {
        try {
            if (!Files.exists(file)) {
                Files.writeString(file, String.valueOf(mark));
            } else {
                Files.write(file, List.of(String.valueOf(mark)), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void average(Path file) {
        if (!Files.exists(file)) {
            throw new IllegalArgumentException("Not a valid file " + file.toString());
        }
        try {
            List<String> lines = Files.readAllLines(file);
            int sum = 0;
            for (String s: lines) {
                sum += Integer.parseInt(s);
            }
            Files.writeString(file, "average: " + (double)sum / lines.size(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
