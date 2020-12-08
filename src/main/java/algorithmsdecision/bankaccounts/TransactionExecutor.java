package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction tr : transactions) {
            BankAccount account = null;
            boolean accountFound = false;
            int i = 0;
            while (i < accounts.size() && account == null) {
                if (tr.getAccountNumber().equals(accounts.get(i).getAccountNumber())) {
                    account = accounts.get(i);
                    accountFound = true;
                    tr.setStatusPending();
                }
                if (accountFound) {
                    switch (creditOrDebit(tr)) {
                        case "Credit" :
                            account.deposit(tr.getAmount());
                            tr.setStatusSucceeded();
                            break;
                        case "Debit" :
                            account.withdraw(tr.getAmount());
                            tr.setStatusSucceeded();
                            break;
                        default :
                    }
                }
                i++;
            }
        }
    }

    private String creditOrDebit(Transaction tr) {
        if (tr.isCredit()) {
            return "Credit";
        }
        return "Debit";
    }
}
