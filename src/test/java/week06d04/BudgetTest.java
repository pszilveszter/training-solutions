package week06d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
    Item i1 = new Item(230, LocalDate.of(2020,8,9), "1 gombóc fagyi");
    Item i2 = new Item(3000, LocalDate.of(2020,10,11), "Starndbelépő");
    Item i3 = new Item(150, LocalDate.of(2020,8,9), "1 kg alma");
    Item i4 = new Item(9000, LocalDate.of(2020,10,1), "20 l benzin");
    Budget b = new Budget(List.of(i1, i2, i3, i4));

    @Test
    void testGetItemsBymonthFound() {
        assertEquals(List.of(i1, i3),b.getItemsByMonth(LocalDate.of(1977,8,9)));
    }

    @Test
    void testGetEmpty() {
        assertEquals(List.of(),b.getItemsByMonth(LocalDate.of(1977,9,9)));
    }

    @Test
    void testInvalidPrice() {
        assertThrows(IllegalArgumentException.class, ()-> new Item(-1, LocalDate.of(1999,1,1),"nyunyi"));
    }

    @Test
    void testEmptyName() {
        assertThrows(IllegalArgumentException.class, ()-> new Item(1, LocalDate.of(2000,1,1),""));
    }

    @Test
    void testNullName() {
        assertThrows(IllegalArgumentException.class, ()-> new Item(1, LocalDate.of(2000,1,1),null));
    }
}