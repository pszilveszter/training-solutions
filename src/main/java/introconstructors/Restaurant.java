package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        capacity = numberOfTables * 4;
        menu = fillMenu();
    }

    private List<String> fillMenu() {
        List<String> menuItems = new ArrayList<>();
        menuItems.add("Halászlé");
        menuItems.add("Spenót");
        menuItems.add("Paprikáscsirke");
        menuItems.add("Túrós csusza");
        return menuItems;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
