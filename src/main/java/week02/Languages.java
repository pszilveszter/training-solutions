package week02;

public class Languages {
    public static void main(String[] args) {
        String[] languages = {"Java", "Pyton", "JavaScript"};
        for (String item: languages) {
            if (item.length() > 5) System.out.println(item);
        }
    }
}
