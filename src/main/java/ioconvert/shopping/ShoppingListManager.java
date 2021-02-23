package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {


    public void saveShoppingList(OutputStream os, List<String> basket) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {
            for (String item: basket) {
                writer.write(item+ "\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file", ioe);
        }
    }


    public List<String> loadShoppingList(InputStream is) {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read stream", ioe);
        }
        return result;
    }
}
