package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operator = new Operators();
        System.out.println(operator.isEven(0));
        System.out.println(operator.isEven(1));
        System.out.println(operator.isEven(2));

        System.out.println("16 jobbra(1x)" + Integer.parseInt(Integer.toBinaryString(16 >> 1),2));
        System.out.println("16 balra(1x)" + Integer.parseInt(Integer.toBinaryString(16 << 1),2));
        System.out.println("13 jobbra(1x)" + Integer.parseInt(Integer.toBinaryString(13 >> 1),2));
        System.out.println("13 balra(1x)" + Integer.parseInt(Integer.toBinaryString(13 << 1),2));
        // jobbra 1-el osztás 2-vel, jobbra 2-el osztás 2^2-al (4)
        // barla 1-el szorzás 2-vel, jobbra 2-el szorzás 2^2-al (4)

        System.out.println(operator.multiplyByPowerOfTwo(13,2)); // a hagyományos szorzáshoz még az eredményt osztni szükséges 2-vel, illetve 0-val való szorzás eredményét külön kell definiálni


        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int j = Long.valueOf(s, 2).intValue();
        System.out.println(j);
        // az int tipus felső korlátjának bináris reprezentációja 0111...111 azaz 31db 1-es
        // míg a -1 a kettes komplementer miatt 32db 1-es, aminek a 10-es számrendszerbe való konvártálásakor
        // a túlcsordulás miatt már csak 64 biten, azaz Long-ban van értelme,
        // aminek az .intValue() metódusával lehet a megfelelő típuskonverziót elvégezni

        System.out.println(0333);
        // A 0-val kezdődő szám reprezentációja 10-es számrendszerben jelzi a KVM felé,
        // hogy itt oktális formában adtuk meg a számot 10-es számrendszerben leírva
        // azaz (3*64) + (3*8) + (3*1) = 192 + 24 + 3 = 219

    }

}
