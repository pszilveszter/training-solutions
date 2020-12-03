package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        s = s.strip();
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equalsIgnoreCase(sb.toString());
    }
}
