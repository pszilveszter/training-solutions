package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        // boolean b; // nem lehet kiiratni, nincs inicializálva
        boolean b = false;
        System.out.println(b);

        int a = 2;
        int i = 3, j = 4;
        int k = i;
        // System.out.println(c); // nem ehet definiálás előtt kiírni

        String s = "Hello World";
        String t = s;

        {
            int x = 0;

            System.out.println(a); // ki lehet írni
        }

        // System.out.println(x); // Ez nem sikerül mert a változó hatóköre a blokkra vonatkozik
    }
}
