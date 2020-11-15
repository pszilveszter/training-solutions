package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person p1;
        Person p2;

        p1 = new Person("Kiss Ramóna",32);
        p2 = p1;
        p2.setName("Nagy Rozália");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        // mind2 változót frissítettük, mert ezek  a stack-en lévő referenciák amik ugyanoda mutatnak a heap-en, kvázi ugyanarra az ojektumra

        int a;
        int b;
        a = 24;
        b = a;
        b++;
        System.out.println(a);
        System.out.println(b);
        // csak az egyik változó értéke változozz meg, ezek a stack-en vannak és értéket adnak át, azaz a B = a esetében a b értéke 24 lett

        p1 = new Person("Nagyfi László",47);
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        // a két érték már nem ugyanaz, a p1-nek új objektumot és egynem új hivatkozást készítettümk
    }
}
