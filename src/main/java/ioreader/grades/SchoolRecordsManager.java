package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void readGradesFromFile(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                for (int i = 1; i < data.length; i++) {
                    grades.add(Integer.parseInt(data[i]));
                }
                students.add(new Student(data[0], grades));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Unable to read file");
        }
    }

    public double classAverage() {
        double sumClass = 0;
        for (Student s : students) {
            sumClass += s.average();
        }
        return sumClass / students.size();
    }
}
