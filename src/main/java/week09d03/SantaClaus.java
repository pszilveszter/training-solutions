package week09d03;

import java.util.List;

public class SantaClaus {
    private final List<Person> persons;

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public void getThroughChimneys() {
        for (Person p : persons) {
            p.setPresent();
        }
    }

    public List<Person> getPersons() {
        return List.copyOf(persons);
    }
}
