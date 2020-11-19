package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Circle> circle = new ArrayList<>();
        int repeat = 2;

        System.out.println("*** Add meg két kőr átmérőjét ***");
        for (int i = 0; i < repeat; i++) {
            System.out.println(i + 1 + ". kőr átmérője");
            circle.add(new Circle(scanner.nextInt()));
        }

        for (int i = 0; i < circle.size(); i++) {
            System.out.println(i + 1 + ". kőr kerülete = " + circle.get(i).perimeter());
        }
        for (int i = 0; i < circle.size(); i++) {
            System.out.println(i + 1 + ". kőr területe = " + circle.get(i).area());
        }
    }
}
