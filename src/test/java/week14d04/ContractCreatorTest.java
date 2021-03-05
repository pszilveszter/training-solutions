package week14d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractCreatorTest {

    @Test
    void testContractCreator() {
        ContractCreator cc = new ContractCreator("Kontó Ottó", List.of(100, 200, 150, 300, 250, 400, 350, 500, 450, 600, 550, 700));
        assertEquals("Kontó Ottó", cc.getTemplate().getClient());
        assertEquals(700, cc.getTemplate().getMonthlyPrices().get(11));
    }

    @Test
    void testCreate() {
        ContractCreator cc = new ContractCreator("Kontó Ottó", List.of(100, 200, 150, 300, 250, 400, 350, 500, 450, 600, 550, 700));
        Contract l = cc.create("Számla Laci");
        assertEquals(cc.getTemplate().getMonthlyPrices(), l.getMonthlyPrices());
    }

    @Test
    void testCreateAndModify() {
        ContractCreator cc = new ContractCreator("Kontó Ottó", List.of(100, 200, 150, 300, 250, 400, 350, 500, 450, 600, 550, 700));
        Contract zs = cc.create("Zsozsó Zsófi");

        zs.getMonthlyPrices().set(11, 1);
        assertEquals(700, cc.getTemplate().getMonthlyPrices().get(11));
        assertEquals(1, zs.getMonthlyPrices().get(11));
    }

}