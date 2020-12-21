package inherittancemethods.bancaccount;

public class CreditAccount extends DebitAccount {

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public boolean transaction(long amount) {
        long transactionCost = costOfTransaction(amount);
        if (amount + transactionCost > getBalance() + overdraftLimit) {
            return false;
        }
        if (getBalance() >= amount + transactionCost) {
            super.transaction(amount);
        } else {
            amount -= getBalance();
            balanceToZero();
            overdraftLimit -= amount + transactionCost;
        }
        return true;
    }


    public long getOverdraftLimit() {
        return overdraftLimit;
    }
}
