package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateManager {

    public String merge(Path file, List<Employee> employees) {
        List<Employee> el = readFromFile(file, employees);
        return append(el);
    }

    private List<Employee> readFromFile(Path file, List<Employee> employees) {
        List<Employee> allEmployees = new ArrayList<>(employees);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.substring(line.indexOf(":") + 2, line.indexOf(","));
                String year = line.substring(line.lastIndexOf(":") + 2);
                Employee e = new Employee(name, year);
                allEmployees.add(e);
            }
            return allEmployees;
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + file, ioe);
        }
    }

    private String append(List<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee e: employees) {
            sb.append(String.format("Az alkalmazott neve: %s", e.getName()));
            sb.append(String.format(", születési éve: %s", e.getYear()));
            sb.append("\r\n");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
