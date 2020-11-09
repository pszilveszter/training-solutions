package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> DAY_NAMES = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    private List<String> inicializedListVariable;

    public Week() {
        // Setter doing the setup in a separate call
    }

    public List<String> getInicializedListVariable() {
        return inicializedListVariable;
    }
    public void setInicializedListVariable(List<String> stringList) {
        inicializedListVariable = stringList;
    }

    public static void main(String[] args) {
        Week week = new Week();
        System.out.println(DAY_NAMES.get(1));
        // Nem lehet törölni mert FINAL // week.DAY_NAMES.remove(1);
        // Nem lehet hozzáadni mert FINAL // week.DAY_NAMES.add(1,"Szerda");

        // Lehet viszont változtatni, na ez érdekes
        DAY_NAMES.set(1, "Szerda");
        // és ez a változtatás az osztály összes, akár már meglévő példányira is igaz
        System.out.println(DAY_NAMES.get(1));
        System.out.println(week.DAY_NAMES.get(1));

        week.setInicializedListVariable(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println(week.getInicializedListVariable());
        // nem lehet törölni FINAL miatt
//        DAY_NAMES.clear();
//        System.out.println(DAY_NAMES);
//        DAY_NAMES.addAll(week.getInicializedListVariable());
//        System.out.println(DAY_NAMES);
    }
}
