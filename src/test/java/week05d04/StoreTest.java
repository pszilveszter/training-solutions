package week05d04;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @Test
    void testAddProduct() {
        Product validProduct = new Product("burgonya",2021,11,26);
        assertTrue(store.addProduct(validProduct));
    }

    @Test
    void testExpiredProduct() {
        Product expiredProduct = new Product("répa",2019,11,26);
        assertFalse(store.addProduct(expiredProduct));
    }

    @Test
    void testUniqueProductName() {
        store.addProduct(new Product("krumpli",2050,11,26));
        Product duplicatedProduct = new Product("krumpli",2051,11,26);
        assertFalse(store.addProduct(duplicatedProduct));
    }


}