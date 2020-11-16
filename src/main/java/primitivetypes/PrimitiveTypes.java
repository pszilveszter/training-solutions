package primitivetypes;

public class PrimitiveTypes {
    private final static int BITS = 32;

    public static String toBinaryString(int n) {
        // FELADAT: adott pozitív egész számot kettes számrendszerbe váltja át
        String result = "";
        for (int i = 0; i < BITS; i++) {
            if (n > 0) {
                int a = n % 2;
                n = n / 2;
                result = a + result;
            } else {
                result = 0 + result;
            }
        }
        return result;
    }
}
