package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        String concat = "" + 1 + 2;
        System.out.println("Összefűzés: " + concat);

        double quotient = 3 / 4;
        System.out.println(quotient); // 0.0 - mind az osztó, mind pedig az osztandó int tipusú
        quotient = 3d / 4;
        System.out.println(quotient); // így helyes, de a 3.0 / 4-el is uyanez

        long big = 3_244_444_444L; // Csak az L suffix-el lehet egy egészszám literál long tipusú, az alapértelmezett int helyett
        System.out.println("Long = " + big);

        String s = "árvíztűrőtükörfúrógép!";
        System.out.println(s); // ??Rvv?-zt??r??t??k????rf??r??g??p!

        String word = "title".toUpperCase();
        System.out.println(word);

        int a = 1;
        System.out.println(Integer.toBinaryString(a));

        a = -2;
        System.out.println(Integer.toBinaryString(a));

    }
}
