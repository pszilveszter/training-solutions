package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();


    public static void main(String[] args) {
        Books book = new Books();
        book.add("Winettou I.");
        book.add("Programozz C nyelven");
        book.add("Winettou III.");
        book.add("Programozás JAVA-ban");
        book.add("Winettou II.");
        System.out.println(book.findAllByPrefix("gram"));
        System.out.println(book.findAllByPrefix("Pro"));
        System.out.println(book.getTitles());

        System.out.println("Bonus");
        book.removeByPrefix("gram");
        System.out.println(book.getTitles());
        book.removeByPrefix("Pro");
        System.out.println(book.getTitles());

    }

    public void removeByPrefix(String prefix) {
        List<String> unMatch = new ArrayList<>();
        int prefixSize = prefix.length();
        for (String title: titles) {
            if (!title.substring(0,prefixSize).equals(prefix)) {
                unMatch.add(title);
            }
        }

        titles.removeAll(getTitles());
        titles.addAll(unMatch);
    }

    public void add(String title) {
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> match = new ArrayList<>();
        int prefixSize = prefix.length();
        for (String title: titles) {
            if (title.substring(0,prefixSize).equals(prefix)) {
                match.add(title);
            }
        }

        return match;
    }

    public List<String> getTitles() {
        return titles;
    }


}
