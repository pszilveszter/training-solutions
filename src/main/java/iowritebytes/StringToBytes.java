package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {


    public void writeAsBytes(List<String> data, Path path) {
        try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
            for (String line: data) {
                if (line.charAt(0) != '_') {
                    os.write(line.getBytes());
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file", ioe);
        }
    }
}
