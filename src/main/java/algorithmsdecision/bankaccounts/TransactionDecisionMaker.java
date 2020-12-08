package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int x) {
        boolean isTransactionFound = false;
        int i = 0;
        while (i < transactions.size() && !isTransactionFound) {
            Transaction tr = transactions.get(i);
            boolean isDebit = tr.isDebit();
            boolean agreeTimeIntervals = tr.getDateOfTransaction().isAfter(startTime) && tr.getDateOfTransaction().isBefore(endTime);
            if (isDebit && agreeTimeIntervals && tr.getAmount() > x) {
                isTransactionFound = true;
            }
            i++;
        }
        return isTransactionFound;
    }
}
