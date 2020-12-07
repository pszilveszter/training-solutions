package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> agents) {
        int sum = 0;
        for (Salesperson agent : agents) {
            sum += agent.getAmount();
        }
        return sum;
    }
}
