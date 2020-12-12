package staticattrmeth.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankTransaction {

    private static final long MIN_VALUE = 1;
    private static final long MAX_VALUE = 10_000_000;

    private static int numOfTransactions;
    private static BigDecimal sumOfTrxs;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long trxValue;



    public BankTransaction(long trxValue) {
        if (MIN_VALUE > trxValue || MAX_VALUE < trxValue) {
            throw new IllegalArgumentException("Transaction amount exceeds boundaries!");
        }
        this.trxValue = trxValue;
        updateSumOfTrxs(trxValue);
        updateCurrentMin(trxValue);
        updateCurrentMax(trxValue);
        numOfTransactions++;
    }


    public static void initTheDay() {
        sumOfTrxs = new BigDecimal("0");
        currentMinValue = MAX_VALUE;
        currentMaxValue = MIN_VALUE;
        numOfTransactions = 0;
    }


    public static BigDecimal averageOfTransaction() {
        return numOfTransactions == 0 ? new BigDecimal(0) : sumOfTrxs.divide(BigDecimal.valueOf(numOfTransactions),0, RoundingMode.HALF_DOWN);
    }


    public static long getCurrentMinValue() {
        return numOfTransactions == 0 ? numOfTransactions : currentMinValue;
    }


    public static long getCurrentMaxValue() {
        return numOfTransactions == 0 ? numOfTransactions : currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;
    }

    public long getTrxValue() {
        return trxValue;
    }


    private static void updateCurrentMin(long trxValue) {
        currentMinValue = Math.min(trxValue, currentMinValue);
    }

    private static void updateCurrentMax(long trxValue) {
        currentMaxValue = Math.max(trxValue, currentMaxValue);
    }

    private static void updateSumOfTrxs(long trxValue) {
        sumOfTrxs = sumOfTrxs.add(BigDecimal.valueOf(trxValue));
    }


}
