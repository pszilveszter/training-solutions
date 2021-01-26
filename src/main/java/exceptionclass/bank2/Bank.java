package exceptionclass.bank2;

import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        if (accountList == null) {
            throw new IllegalArgumentException();
        }
        this.accountList = accountList;
    }



    public void payment(String accountNumber, double amount) {
        Account account = findByNumber(accountNumber);
        account.subtract(amount);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findByNumber(accountNumber);
        account.deposit(amount);
    }

    private Account findByNumber(String accountNumber) {
        for (Account account: accountList) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException();
    }
}
