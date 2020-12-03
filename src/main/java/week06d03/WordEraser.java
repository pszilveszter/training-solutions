//Mai Junior/Mid-level feladat.
// A week06d03.WordEraser osztályban legyen egy eraseWord(String words, String word) metódus,
// mely az első paraméter szöveget úgy változtatja meg, hogy a második paraméter összes előforulását kitörli belőle.
// A words paraméterben a szavak szóközzel vannak elválasztva.
// A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
// (Mellőzzük a replace és replaceAll használatát)

package week06d03;

import java.util.Arrays;
import java.util.List;

public class WordEraser {
    // ERASE!!
    public String eraseWord(String words, String word) {
        int a = 0;
        int lenght = word.length() + 1;
        while (a != -1) {
            a = words.indexOf(word);

            if (a != -1) {
                if (a == 0) {
                    words = words.substring(a + lenght);
                } else if (a < words.length()-lenght) {
                    words = words.substring(0, a).concat(words.substring(a + lenght));
                } else {
                    words = words.substring(0, a - 1);
                }
            }
        }
        return words;
    }

    // REBUILD
    public String eraseWordEnhanced(String words, String word) {
        List<String> items = Arrays.asList(words.split(word));
        StringBuilder sb = new StringBuilder();
        for (String s : items) {
            sb.append(s.stripLeading());
        }
        return sb.toString().strip();
    }
}
