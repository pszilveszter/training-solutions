package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private List<Student> students = new ArrayList<>();
    private Random rnd;
    private String className;


    public ClassRecords(String className, Random rnd) {
        this.rnd = rnd;
        this.className = className;
    }


    public boolean addStudent(Student student) {
        boolean found = false;
        int n = students.size() - 1;
        String studentName = student.getName();
        while (!found && n >= 0) {
            String name = students.get(n).getName();
            found = studentName.equals(name);
            n--;
        }
        if (!found) {
            students.add(student);
        }
        return !found;
    }


    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sum = 0.0;
        for (Student s : students) {
            double average = s.calculateAverage();
            if (average == 0.0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += average;
        }
        return sum / students.size();
    }


    public double calculateClassAverageBySubject(Subject subject) {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sum = 0.0;
        int n = 0;
        for (Student s : students) {
            double subjectAverage = s.calculateSubjectAverage(subject);
            if (subjectAverage > 0.0) {
                sum += subjectAverage;
                n++;
            }
        }
        if (n == 0) {
            return sum;
        }
        return sum / n;
    }


    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }

        boolean found = false;
        int n = students.size() - 1;
        while (!found && n >= 0) {
            found = name.equals(students.get(n).getName());
            if (found) {
                return students.get(n);
            }
            n--;
        }

        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }


    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.getName());
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }


    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResults = new ArrayList<>();
        for (Student s : students) {
            StudyResultByName studyResult = new StudyResultByName(s.getName(), s.calculateAverage());
            studyResults.add(studyResult);
        }
        return studyResults;
    }


    public boolean removeStudent(Student student) {
        boolean found = false;
        int n = students.size() - 1;
        String toDelete = student.getName();
        while (!found && n >= 0) {
            String name = students.get(n).getName();
            if (toDelete.equals(name)) {
                students.remove(n);
                return true;
            }
            n--;
        }
        return found;
    }


    public Student repetition() {
        int i = students.size();
        if (i == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(i));
    }


    public String getClassName() {
        return className;
    }
}
