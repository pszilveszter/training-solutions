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

    public CreditCard(long balance, Currency currency) {
        double exchangeRate = getExchangeRate(currency);
        this.balance = balance * exchangeRate;
        this.currency = Currency.HUF;
    }


    public CreditCard(long balance) {
        this(balance, Currency.HUF);
    }

    //hát a feladat leírás nem ez a konstruktor...
    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        this(balance, currency);
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
