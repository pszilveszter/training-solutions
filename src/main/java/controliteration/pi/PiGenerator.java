package controliteration.pi;

public class PiGenerator {
    public static final String ABC = "aábcdeéfghiíjklmnoóöőpqrstuúüűxyvz";
    private static final String POEM = "Nem a régi s durva közelítés, " +
            "Mi szótól szóig így kijön Betűiket számlálva. " +
            "Ludolph eredménye már, " +
            "Ha itt végezzük húsz jegyen. " +
            "De rendre kijő még tíz pontosan, " +
            "Azt is bízvást ígérhetem. ";

    public String getPi() {

        String word = "";
        int wordLenght = 0;

        for (int i = 0; word.length() < 32; i++) {

            if (ABC.indexOf(POEM.toLowerCase().charAt(i)) >= 0) {
                wordLenght++;
            } else if (wordLenght > 0) {
                word = word + (word.length() == 1 ? "." + wordLenght : wordLenght);
                wordLenght = 0;
            }
        }

        return word;
    }
}
