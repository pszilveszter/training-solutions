// Készíts a week06d05 csomagban egy Biscuit nevű osztályt, amelynek van 2 attribútuma: BiscuitType type és int gramAmount.
// A BiscuitType legyen felsorolásos típus a 3 kedvenc kekszfajtáddal.
// A Biscuit nevű osztálynak legyen egy static metódusa of néven, mely paraméterként egy BiscuitType-ot,
// és egy int gramAmount-ot vár és visszaad egy új Biscuit objektumot amelyet a megadott paraméterek alapján hoz létre.
// Bónusz feladat: konzolra írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!
package week06d05;

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
        if (type.ordinal() == -1 || amount < 0) {
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
