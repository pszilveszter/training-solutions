package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson highestSeller = null;
        for (Salesperson sp : salespersons) {
            if (highestSeller == null || sp.getDifferenceFromTarget() > highestSeller.getDifferenceFromTarget()) {
                highestSeller = sp;
            }
        }
        return highestSeller;
    }
}
