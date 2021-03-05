package week14d02;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendingOrderManagerTest {

    InputStream is = this.getClass().getResourceAsStream("PendingOrders.txt");
    PendingOrderManager o = new PendingOrderManager(is);


    @Test
    void testGetAscProductsOf() {
        String expected = List.of("oregano, passata, pepper, pizza_dough, rosmary, salt").toString();
        String result = o.getAscProductsOf("C123").toString();
        assertEquals(expected, result);
    }

    @Test
    void testCountOfOrder() {
        assertEquals(6, o.countOfOrder("C123"));
    }

    @Test
    void testCountPendingSaleOf() {
        assertEquals(3, o.countPendingSaleOf("sugar"));
    }

    @Test
    void testProductsStat() {
        String expected = "{pepper=1, chips=1, corn=1, rosmary=2, hot_dog=1, tomato=2, cheese=2, cola=1, apple=1, pear=1, potato=1, flour=1, pasta=2, passata=2, pizza_dough=1, beer=2, bbq_sauce=1, bread=1, salt=1, basil=1, oregano=1, rolls=1, soda=2, meet=2, sugar=3, wine=1, carrot=1}";
        String result = o.productsStat().toString();
        assertEquals(expected, result);
    }
}