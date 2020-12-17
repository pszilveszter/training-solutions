package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        for (int i = 0; i < items.size(); i++) {
            if (barcode.equals(items.get(i).getBarcode())) {
                items.remove(i);
            }
        }
    }

    //a Basket ürítése
    public void clearBasket() {
        items.clear();
    }

    // az Item lista másolatát adja vissza!
    public List<Item> getItems() {
        return List.copyOf(items);
    }
}
