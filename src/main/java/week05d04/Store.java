package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();


    public boolean addProduct(Product product) {
        for (Product pr : products) {
            if (product.getName().equals(pr.getName())) {
                return false;
            }
        }


        if (product.getExpirationDate().isBefore(LocalDate.now())) {
            return false;
        }

        products.add(product);
        return true;
    }


    public int getNumberOfExpired() {
        int expiredProducts = 0;
        for (Product product : products) {
            if (product.getExpirationDate().isBefore(LocalDate.now())) {
                expiredProducts++;
            }
        }
        return expiredProducts;
    }
}
