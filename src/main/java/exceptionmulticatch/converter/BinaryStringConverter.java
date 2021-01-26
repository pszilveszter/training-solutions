package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {
        if (str == null) {
            throw new NullPointerException("binaryString null");
        }
        boolean[] result = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0':
                    result[i] = false;
                    break;
                case '1':
                    result[i] = true;
                    break;
                default:
                    throw new IllegalArgumentException("binaryString not valid");
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] b) {
        if (b == null || b.length == 0) {
            throw new IllegalArgumentException("Null or empty list");
        }
        StringBuilder sb = new StringBuilder(b.length);
        for (int i = 0; i < b.length; i++) {
            sb.append(b[i] ? 1 : 0);
        }
        return sb.toString();
    }
}

