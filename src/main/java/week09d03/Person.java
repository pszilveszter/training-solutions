package week09d03;

import java.util.Random;

public class Person {
    private final String name;
    private final int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent() {
        if (isWithinLimit()) {
            Random rnd = new Random();
            present = Present.values()[rnd.nextInt(Present.values().length)];
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
