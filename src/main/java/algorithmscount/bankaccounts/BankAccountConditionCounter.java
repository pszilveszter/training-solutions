package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int i) {
        int count = 0;
        for (BankAccount account : bankAccounts) {
            if (account.getBalance() > i) {
                count++;
            }
        }
        return count;
    }
}
