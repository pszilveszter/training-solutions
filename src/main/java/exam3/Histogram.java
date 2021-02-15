package exam3;

import java.io.*;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                int x = Integer.parseInt(line);
                for (int i = 0; i < x; i++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read", ioe);
        }
    }
}
