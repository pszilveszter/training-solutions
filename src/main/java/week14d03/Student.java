package week14d03;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Student implements Comparable<Student> {

    private String name;
    private Map<String, List<Integer>> rates = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(Student original) {
        this.name = original.name;
        this.rates = new HashMap<>(original.getRates());
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getRates() {
        return Map.copyOf(rates);
    }

    public void addGrade(String courseName, int grade) {
        if (!rates.containsKey(courseName)) {
            rates.put(courseName, new ArrayList<>());
        }
        rates.get(courseName).add(grade);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
