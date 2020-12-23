package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent() {
        if (isWithinLimit()) {
            Random rnd = new Random();
            switch (rnd.nextInt(3)) {
                case 1:
                    present = Present.Decoration;
                    break;
                case 2:
                    present = Present.Electronic;
                    break;
                case 3:
                    present = Present.Housekepping;
                    break;
                default:
                    present = Present.Toy;
            }
        }
    }

    private boolean isWithinLimit() {
        return age <= 14;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }
}
