package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] nameOfDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println("2-ik elem: " + nameOfDays[1]);
        System.out.println("A tömb hossza: " + nameOfDays.length);

        int[] sqr = new int[5];
        for (int i = 0; i < sqr.length; i++) {
            sqr[i] = (int) Math.pow(2.0,i);
        }
        System.out.print("2 hatványai: ");
        for (int sz: sqr) {
            System.out.print(sz + ", ");
        }
        System.out.println();

        boolean[] bol = new boolean[6];
        for (int i = 0; i < bol.length; i++) {
            if (i % 2 == 1) {
                bol[i] = true;
            }
        }
        for (boolean b: bol) {
            System.out.println(b);
        }
    }
}
