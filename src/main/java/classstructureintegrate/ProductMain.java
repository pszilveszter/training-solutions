package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("Termék");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Termék neve?");
        String name = scanner.nextLine();
        System.out.println("Egységára?");
        int price = scanner.nextInt();
        Product product = new Product(name,price);

        System.out.println("Megadott termék: " + product.getName() + ", egységár: " + product.getPrice());

        System.out.println("Várható értéknövekedés mértéke?");
        int priceup = scanner.nextInt();
        System.out.println("Várható értékcsökkenés mértéke?");
        int pricedown = scanner.nextInt();

        product.increasePrice(priceup);
        System.out.println(product.getName() + " várható legalacsonyabb értéke: " + product.getPrice());
        product.decreasePrice(priceup);
        product.decreasePrice(pricedown);
        System.out.println(product.getName() + " várható legmagasabb értéke: " + product.getPrice());
    }
}
