package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        int i = 5;
        Scanner sc = new Scanner(System.in);
        String names[] = new String[i];

        for (int a = 0; a < i; a++) {
            System.out.println("Név:");
            names[a] = sc.nextLine();
        }

        for (String name : names) {
            System.out.println(i - 4 + ".elem: " + name);
            i++;
        }

    }
}
