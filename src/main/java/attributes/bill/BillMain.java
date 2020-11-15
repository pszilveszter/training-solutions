package attributes.bill;

import java.util.Arrays;
import java.util.List;

public class BillMain {
    public static void main(String[] args) {
        Item item1 = new Item("Krumpli",10,156.3);
        Item item2 = new Item("Hagyma", 3,134.7);
        Item item3 = new Item("Tojás",10,33.3);

        Bill bill = new Bill();
        bill.addItem(item1);
        bill.addItem(item2);
        bill.addItem(item3);

        int n = bill.getItems().size();
        System.out.println(n + " termék ára: " + bill.calculateTotalPrice());

    }
}
