package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson mostWeakSeller = null;
        for (Salesperson sp : salespersons) {
            if (mostWeakSeller == null || sp.getDifferenceFromTarget() < mostWeakSeller.getDifferenceFromTarget())
                mostWeakSeller = sp;
        }
        return mostWeakSeller;
    }
}
