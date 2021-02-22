package iofiles;

import java.io.*;
import java.nio.file.*;

public class Installer {

    public void install(String path) {
        Path output = Path.of(path);
        if (Files.notExists(output) || !Files.isDirectory(output)) {
            throw new IllegalArgumentException("Output directory does not exist! " + output);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Installer.class.getResourceAsStream("/Install/Install.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("/")) {
                    Files.createDirectory(output.resolve(line));
                } else {
                    Files.copy(Installer.class.getResourceAsStream("/Install/" + line), output.resolve(line), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }
}
