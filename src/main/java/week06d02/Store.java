package week06d02;

import java.util.List;

public class Store {
    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category cat) {
        int a = 0;
        for (Product p : products) {
            if (p.getCategory() == cat) {
                a++;
            }
        }
        return a;
    }
}
