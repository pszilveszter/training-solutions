package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Mark> marks = new ArrayList<>();
    private String name;


    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }


    public double calculateAverage() {
        double sum = 0.0;
        for (Mark m : marks) {
            sum += m.getMarkType().getValue();
        }
        return Math.round(sum * 100 / marks.size()) / 100d;
    }


    public double calculateSubjectAverage(Subject subject) {
        double sum = 0.0;
        int divisor = 0;
        for (Mark m : marks) {
            if (subject.getSubjectName().equals(m.getSubject().getSubjectName())) {
                sum += m.getMarkType().getValue();
                divisor++;
            }
        }
        if (divisor == 0) {
            return sum;
        }
        return Math.round(sum * 100 / divisor) / 100d;
    }


    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }


    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" marks: ");
        for (Mark m : marks) {
            sb.append(m.getSubject().getSubjectName());
            sb.append(": ");
            sb.append(m.toString());
        }
        return sb.toString();
    }

}
