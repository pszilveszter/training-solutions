package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(grades);
    }

    public double average() {
        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum / grades.size();
    }

    public boolean isIncreasing() {
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) <= grades.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
