package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;

        Boolean b = message.equals("Hello John Doe");
        Boolean c = message.equals("Hello John Doe444");

        String empty1 = "";
        String empty2 = "";
        int howLong = (empty1 + empty2).length();
        System.out.println("Két üres String összefűzésének a hossza: " + howLong);

        String abc = "Abcde";
        System.out.println("Az Abcde String hossza: " + abc.length());
        System.out.println("Az első és harmadik karaktere (0-tól indexelünk) vesszővel elválasztva: " + abc.substring(0,1) + "," + abc.substring(2,3));
        System.out.println("Az elsőtől a harmadik karakterig tartó részlete: " + abc.substring(0,3)); // Feladat szerint a 3-ik karater-IG, tehát az már nem
    }
}
