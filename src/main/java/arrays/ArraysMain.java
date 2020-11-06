package arrays;

import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain array = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(array.numberOfDaysAsString());
    }

/* Ajaj, ez a feladat nekem listának tünik, amit még nem vettem, visszatérek később
    public List<String> daysOfWeek() {

    }
*/

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String daysOfMoths = "";
        for (int monthDays: numberOfDays) {
            daysOfMoths += monthDays + " ";
        }
        return daysOfMoths;
    }
}
