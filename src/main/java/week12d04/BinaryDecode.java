package week12d04;

import java.io.IOException;
import java.io.InputStream;

public class BinaryDecode {

    public String decode() {
        StringBuilder sb = new StringBuilder();
        try (InputStream stream = this.getClass().getResourceAsStream("secret.dat")) {
            byte[] b = new byte[1]; //"Olvasd be bájtonként"
            int size;
            while ((size = stream.read(b)) > 0) {
                char c = (char)(b[0] + 10);
                sb.append(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String secret = new BinaryDecode().decode();
        System.out.println(secret);
    }
}