package exceptionclass.bank2;

public class Account {
    private final String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidAmountBankOperationException();
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double value) {
        if (value < 0) {
            throw new InvalidAmountBankOperationException();
        }
        if (value > this.balance) {
            throw new LowBalanceBankOperationException();
        }
        if (value > maxSubtract) {
            return balance;
        }
        balance -= value;
        return balance;
    }

    public double deposit(double value) {
        if (value < 0) {
            throw new InvalidAmountBankOperationException();
        }
        balance += value;
        return balance;
    }
}
