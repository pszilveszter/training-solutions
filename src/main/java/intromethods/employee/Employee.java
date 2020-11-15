package intromethods.employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String hiringYear;
    private int salary;

    public Employee(String name, String hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public void raiseSalary(int rateOfIncrease) {
        salary += rateOfIncrease;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear='" + hiringYear + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }
}
