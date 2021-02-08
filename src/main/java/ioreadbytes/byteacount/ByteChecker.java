package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String strPath) {
        Path path = Path.of(strPath);
        try (InputStream is = new BufferedInputStream(Files.newInputStream(path))) {
            byte[] buffer = new byte[1000];
            int size;
            int count = 0;
            while ((size = is.read(buffer)) > 0) {
                for (byte data: buffer) {
                    if (data == (byte) 'a') {
                        count++;
                    }
                    buffer = new byte[1000];
                }
            }
            return count;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file, ioe");
        }
    }
}
