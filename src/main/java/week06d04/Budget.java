package week06d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(LocalDate m) {
        List<Item> r = new ArrayList<>();
        for (Item i : items) {
            if (i.getMonth() == m.getMonthValue()) {
                r.add(i);
            }
        }
        return r;
    }
}
