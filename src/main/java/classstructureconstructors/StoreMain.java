package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        System.out.println("Raktár osztály!");
        Store store = new Store("Java tudás");

        System.out.println(store.getProduct());
        System.out.println("Első nap");
        System.out.println("\tA korábban megszerzett tudás mértékegysége " + store.getStock());
        store.store(3);

        System.out.println("Második nap");
        System.out.println("\tA tegnap megszerzett tudás mértékegysége " + store.getStock());
        store.dispatch(1);
        System.out.println("\tA felejtés következtében megmaradt tudás " + store.getStock());
        store.store(3);

        System.out.println("Harmadik nap");
        System.out.println("\tA tegnap megszerzett tudás mértékegysége " + store.getStock());
        store.dispatch(1);
        System.out.println("\tA felejtés következtében megmaradt tudás " + store.getStock());
        store.store(3);

    }
}
