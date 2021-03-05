package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook() {
        List<Student> ascendingStudents = new ArrayList<>();
        for (Student s: students) {
            ascendingStudents.add(new Student(s));
        }
        Collections.sort(ascendingStudents);
        return ascendingStudents;
    }
}
