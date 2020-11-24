package week05d02;

public class ChangeLetter {
    public static final String ENGVOW = "aeiou";

    public String changeVowels(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (ENGVOW.indexOf(input.charAt(i)) > -1 ) {
                result += input.charAt(i);
            } else {
                result += "*";
            }
        }
        return result;
    }
}
