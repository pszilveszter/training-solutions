package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {

    private String word;
    private List<String> translations = new ArrayList<>();


    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        addTranslations(translations);
        // Bonusz: ha a 2-ik paramétert egy az egyben adnánk értékül,
        // akkor az addTranslation metódus nem fut le
        // és ezért létre lehet hozni egy fordítást akár többször is a konstruktorban
    }

    public void addTranslations(List<String> newTranslations) {
        for (String translation : newTranslations) {
            if (!translations.contains(translation)) {
                translations.add(translation);
            }
        }
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }
}
