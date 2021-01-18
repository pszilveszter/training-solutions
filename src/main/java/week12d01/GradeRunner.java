package week12d01;

public class GradeRunner {

    //Készíts egy GradeRounder osztályt, amiben van egy int[] roundGrades(int[] grades) metódus.
    // A grades tömb pontszámokat tartalmaz 0 és 100 között.
    // A feladat az, hogy kerekítsük a benne lévő számokat a következő szabály szerint:
    // Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3, akkor kerekítsük fel a számot az 5 következő többszörösére.
    // Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket egyáltalán nem kell kerekíteni.
    //  Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.

    public static int[] roundGrades(int[] grades) {
        int[] r = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 40) {
                r[i] = round(grades[i]);
            } else {
                r[i] = grades[i];
            }
        }
        return r;
    }

    private static int getNextFiveRound(int i) {
        while (i % 5 != 0) {
            i++;
        }
        return i;
    }

    private static int round(int i) {
        if (getNextFiveRound(i) - i < 3) {
            return getNextFiveRound(i);
        } else {
            return i;
        }
    }

}
