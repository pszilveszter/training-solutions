// A GitHubon a `examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv` fájl tartalmazza a magyar városok listáját.
//Add vissza a leghosszabb nevű várost!

package week13d01;

import java.io.BufferedReader;
import java.io.IOException;

public class ReadFile {

    public String longestCity(BufferedReader reader) {
        String city = "";
        String line;
        try {
            skipHeader(reader);
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (city.length() < data[1].length()) {
                    city = data[1];
                }
            }
            return city;

        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }

    private String skipHeader(BufferedReader br) throws IOException {
        return br.readLine();
    }
}
