package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println("Létrehozunk egy új ügyfél objektumot, beállítjuk az attribútumokat, majd a címét megváltoztatjuk a \"migrate()\" metódussal");

        Client client = new Client();
        client.setName("Sean Connery");
        client.setYear(1930);
        client.setAddress("UK");

        System.out.println(client.getName() + " (" + client.getYear() + ") - " + client.getAddress());

        client.migrate("Bahama");

        System.out.println("Új cím: " + client.getAddress());
    }
}
