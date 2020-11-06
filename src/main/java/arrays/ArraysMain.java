package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain array = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(array.numberOfDaysAsString());

        System.out.println("daysOfWeek");
        System.out.println(array.daysOfWeek());
    }
/*
    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int outer = 0; outer) > size;
    }
    /*************************************************************************************
* Ajaj, ez a feladat nekem listának tünik, amit még nem vettem, visszatérek később
* UPDATE: Nem baj, azért megpróbálom a korábbi tapasztalatok alapján
* Hát csak sikerült, remélem jól értelmeztem
************************************************************************************** */
    public List<String> daysOfWeek() {
        List<String> dayNames= new ArrayList<>();
        dayNames.add("Hétfő");
        dayNames.add("Kedd");
        dayNames.add("Szerda");
        dayNames.add("Csütörtök");
        dayNames.add("Péntek");
        dayNames.add("Szombat");
        dayNames.add("Vasárnap");

        return dayNames;
    }


    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays); // Közben rájöttem az adott tananyaghoz ez jobban illeszkedik
    }
}
