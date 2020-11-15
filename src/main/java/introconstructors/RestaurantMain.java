package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant resti = new Restaurant("Étterem a 4 betyárhoz", 17);
        System.out.println("Étterem neve: " + resti.getName());
        System.out.println("Étterem fogadóképessége: " + resti.getCapacity());
        System.out.println("Étterem kínálata: " + resti.getMenu());
    }
}
