package primitivetypes;

public class PrimitveTypesMain {
    public static void main(String[] args) {
        boolean b = Integer.toBinaryString(500).equals(PrimitiveTypes.toBinaryString(500));
        System.out.println(b);

        System.out.println(Integer.toBinaryString(500));
        System.out.println(PrimitiveTypes.toBinaryString(500));

        //Bonusz
        System.out.println(new Integer(1) + new Integer(2)); //Már a fordító unboxingal int primitív tipússá alakítja
        // amugy nem lehetne összeadni mert ez két objektum, de az unboxing miatt lehet

    }
}
