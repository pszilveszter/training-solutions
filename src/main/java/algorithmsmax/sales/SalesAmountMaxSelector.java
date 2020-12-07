package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson bestSeller = null;
        for (Salesperson sp : salespersons) {
            if (bestSeller == null || sp.getAmount() > bestSeller.getAmount())
                bestSeller = sp;
        }
        return bestSeller;
    }
}
