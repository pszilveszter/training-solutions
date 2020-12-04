package week06d05;

import java.io.UncheckedIOException;

public class Biscuit {
    private String biscuitType;
    private int gramAmount;

    public void setBiscuitType(String biscuitType) {
        this.biscuitType = biscuitType;
    }

    public void setGramAmount(int gramAmount) {
        this.gramAmount = gramAmount;
    }

    public static Object of(BiscuitType type, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Bad data!");
        }
        Biscuit b = new Biscuit();
        b.setBiscuitType(type.name());
        b.setGramAmount(amount);
        return b;
    }

    @Override
    public String toString() {
        return biscuitType + " " + gramAmount;
    }
}
