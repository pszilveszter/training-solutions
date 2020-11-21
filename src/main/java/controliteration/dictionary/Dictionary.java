package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<DictionaryItem> dictionaryItems = new ArrayList<>();


    public void addItem(String word, List<String> translations) {
        boolean isExisting = false;

        for (DictionaryItem item : dictionaryItems) {
            if (item.getWord().equals(word)) {
                item.addTranslations(translations);
                isExisting = true;
            }
        }

        if (!isExisting) {
            dictionaryItems.add(new DictionaryItem(word, translations));
        }
    }

    public List<String> findTranslations(String word) {
        List<String> translations = new ArrayList<>();
        for (DictionaryItem item : dictionaryItems) {
            if (item.getWord().equals(word)) {
                translations = item.getTranslations();
            }
        }
        return translations;
    }
}
