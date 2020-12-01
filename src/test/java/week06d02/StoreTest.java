package week06d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void addStore() {
        Store s = new Store(List.of(
                new Product("mirelitkrumpli", Category.FROZEN,300),
                new Product("sültkrumpli", Category.BAKEDGOODS,500),
                new Product("alma", Category.OTHER, 100),
                new Product("zöldségmix", Category.FROZEN, 250)));

        int a = s.getProductByCategoryName(Category.FROZEN);
        assertEquals(2, a);
    }

}