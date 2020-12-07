package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sum = 0;
        for (Transaction tr : transactions) {
            if (tr.isCredit()) {
                sum += tr.getAmount();
            }
        }
        return sum;
    }

}
