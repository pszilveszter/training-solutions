package inherittancemethods.bancaccount;

public class DebitAccount {

    private static final double COST = 3.0;
    private static final long MIN_COST = 200;

    private String accountNumber;
    private long balance;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public final long costOfTransaction(long amount) {
        long baseCost = (long) (amount * COST / 100);
        return Math.max(baseCost, MIN_COST);
    }

    public boolean transaction(long amount) {
        if (amount + costOfTransaction(amount) > balance) {
            return false;
        }
        balance -= amount + costOfTransaction(amount);
        return true;
    }

    // az egyenleget nullázza le, túlköltés esetén
    public void balanceToZero() {
        balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
}
