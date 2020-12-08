package algorithmsdecision.bankaccounts;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


}
