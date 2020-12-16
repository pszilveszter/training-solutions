package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> RATE;

    private double balance;
    private Currency currency;

    static {
        List<Rate> rates = new ArrayList<>();
        for (Currency c : Currency.values()) {
            rates.add(new Rate(c, c.getConversionRate()));
        }
        RATE = rates;
    }

    /// FONTOS!!!
    // feladat szerint "public CreditCard(long balance, Currency currency)"
    // és ennek így semmi köze az inicializátorhoz::
    // public CreditCard(long balance, Currency currency, List<Rate> upload) {
    // teszt Rate törölve, helyette rate-ek enumból konstansba töltve még ha nem is olyan proper a dolog...

    public CreditCard(long balance, Currency currency) {
        double exchangeRate = getExchangeRate(currency);
        this.balance = balance * exchangeRate;
        this.currency = Currency.HUF;
    }


    public CreditCard(long balance) {
        this.balance = balance;
        this.currency = Currency.HUF;
    }


    public double getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        double exchangeRate = getExchangeRate(currency);
        double amountInDefaultCurrency = amount * exchangeRate;
        if (balance >= amountInDefaultCurrency) {
            balance -= amountInDefaultCurrency;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, currency);
    }

    private double getExchangeRate(Currency currency) {
        for (Rate r: RATE) {
            if (currency.name().equals(r.getCurrency().name())) {
                return r.getConversionFactor();
            }
        }
        throw new IllegalArgumentException("Invalid currency");
    }
}
