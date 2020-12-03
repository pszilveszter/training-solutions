package week06d04;

import java.time.LocalDate;

public class Item {
    private int price;
    private int month;
    private String name;

    public Item(int price, LocalDate month, String name) {
        if (isEmptyString(name) || invalidPrice(price)) {
            throw new IllegalArgumentException("Bad input!");
        }
        this.price = price;
        this.month = month.getMonthValue();
        this.name = name;
    }

    private boolean isEmptyString(String s) {
        return s == null || s.isBlank();
    }

    private boolean invalidPrice(int p) {
        return p < 0;
    }


    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
