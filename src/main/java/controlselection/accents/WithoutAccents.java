package controlselection.accents;

public class WithoutAccents {
    public static final String HUN = "áÁéÉíÍóÓöÖőŐúÚüÜűŰ";
    public static final String LAT = "aAeEiIoOoOoOuUuUuU";

    public char convertToCharWithoutAccents(char letter) {
        int i = HUN.indexOf(letter);
        if (i >= 0) {
            return LAT.charAt(i);
        } else {
            return letter;
        }
    }
}
