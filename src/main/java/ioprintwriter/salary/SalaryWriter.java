package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name: names) {
                writer.print(name + ": ");
                writer.println(getSalary(name));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Unable to read / write file " + file.toString());
        }
    }

    private int getSalary(String name) {
        switch (name.substring(0, name.indexOf(" ") - 1)) {
            case "Dr":
                return  500_000;
            case "Mr":
            case "Mrs":
                return 200_000;
            default:
                return  100_000;
        }
    }
}
