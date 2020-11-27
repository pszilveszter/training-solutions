package week05d04;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate expirationDate;

    public Product(String name, int expirationYear, int expirationMonth, int expirationDay) {
        this.name = name;
        expirationDate = LocalDate.of(expirationYear, expirationMonth, expirationDay);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
