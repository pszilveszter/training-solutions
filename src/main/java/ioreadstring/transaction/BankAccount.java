package ioreadstring.transaction;

public class BankAccount {
    private String name;
    private final String accountNumber;
    private double balance;

    public BankAccount(String ownerName, String accountNumber, double balance) {
        if (isEmpty(ownerName)) {
            throw new IllegalArgumentException("Invalid Name parameter");
        }
        if (isEmpty(accountNumber)) {
            throw new IllegalArgumentException("Invalid Account Number parameter");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid opening Balance");
        }
        this.name = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double trValiue) {
        if (balance + trValiue < 0) { // no credit
            throw new IllegalArgumentException("Limit overrun");
        }
        this.balance += trValiue;
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}
