package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int i) {
        int count = 0;
        for (Transaction tr : transactions) {
            if (tr.getAmount() < i) {
                count++;
            }
        }
        return count;
    }
}
