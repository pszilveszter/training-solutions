package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction tr : transactions) {
            BankAccount account = findRelevantAccount(accounts, tr.getAccountNumber());
            if (executeCurrentTransaction(account, tr)) {
                tr.setStatusPending();
            } else {
                tr.setStatusSucceeded();
            }
        }
    }


    private boolean executeCurrentTransaction(BankAccount bankAccount, Transaction tr) {
        int before = bankAccount.getBalance();
        if (tr.isCredit()) {
            bankAccount.deposit(tr.getAmount());
        } else if (tr.isDebit()) {
            bankAccount.withdraw(tr.getAmount());
        }
        int after = bankAccount.getBalance();
        return before != after;
    }


    private BankAccount findRelevantAccount(List<BankAccount> accounts, String accountNumber) {
        BankAccount bankAccount = null;
        for (BankAccount a : accounts) {
            if (accountNumber.equals(a.getAccountNumber())) {
                bankAccount = a;
            }
        }
        return bankAccount;
    }

}
