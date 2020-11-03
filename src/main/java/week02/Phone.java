package week02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Típus megadása");
        String typeA = scanner.nextLine();
        System.out.println("Mem megadása");
        int memA = scanner.nextInt();
        scanner.nextLine();

        Phone phoneA = new Phone(typeA,memA);

        System.out.println("Típus megadása");
        typeA = scanner.nextLine();
        System.out.println("Mem megadása");
        memA = scanner.nextInt();
        scanner.nextLine();

        Phone phoneB = new Phone(typeA,memA);

        System.out.println(phoneA.getType() + " " +  phoneA.getMem());
        System.out.println(phoneB.getType() + " " + phoneB.getMem());
    }
}
