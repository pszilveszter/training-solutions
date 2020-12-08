package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {
    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {
        boolean result = false;
        int i = 0;
        while (i < accounts.size() && !result) {
            if (accounts.get(i).getBalance() > min) {
                result = true;
            }
            i++;
        }
        return result;
    }
}
