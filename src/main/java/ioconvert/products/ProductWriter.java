package ioconvert.products;

import java.io.*;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream os, List<Product> products) {

        PrintStream writer = new PrintStream(os);
        for (Product product : products) {
            writer.print(product.getName());
            writer.print(";");
            writer.println(product.getPrice());
        }
    }
}
