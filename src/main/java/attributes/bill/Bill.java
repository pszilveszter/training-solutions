package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Item> items = new ArrayList<>();

    public double calculateTotalPrice() {
        double result = 0;
        for (Item i : items) {
            result = result + (i.getPrice() * i.getQuantity());
        }
        return result;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
