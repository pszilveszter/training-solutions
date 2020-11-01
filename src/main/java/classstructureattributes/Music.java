package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        System.out.println("Ez az osztály a felhasználói inputban megadott zeneszám tulajdonságait tárolja egy objektumban");

        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Írd be az előadó nevét");
        song.band = scanner.nextLine();
        System.out.println("Írd be dal címét");
        song.title = scanner.nextLine();
        System.out.println("Add meg a mű hosszát percben");
        song.lenght = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.lenght + " perc)");
    }
}
