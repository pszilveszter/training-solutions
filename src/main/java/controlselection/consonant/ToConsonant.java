package controlselection.consonant;

public class ToConsonant {
    public char convertToConsonant(char letter) {
        Character c = Character.toLowerCase(letter);
        int decimalCode = c.hashCode();

        Character r;

        switch (decimalCode) {
            case 97:
            case 101:
            case 105:
            case 111:
            case 117:
               r = (char) (decimalCode + 1);
               break;
            default:
                r = (char) decimalCode;
        }
        return r;
    }
}
