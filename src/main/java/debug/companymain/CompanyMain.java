package debug.companymain;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee rambo = new Employee("John Rambo", 1982);
        Employee rocky = new Employee("Rocky Balboa", 1976);

        List<Employee> employees = new ArrayList<>();
        employees.add(rambo);
        employees.add(rocky);

        Company company = new Company(employees);

        Employee tango = new Employee("Ray Tango", 1989);
        Employee sly = new Employee("Extra Elek", 2020);
        company.addEmployee(tango);

        Employee ray = company.findEmployeeByName("Ray Tango");
        System.out.println(ray.getName() + " - (" + ray.getYearOfBirth() + ")");

        List<String> allEmployeesOfCompany = new ArrayList<>();
        allEmployeesOfCompany.addAll(company.listEmpoyeeNames());
        System.out.println(allEmployeesOfCompany);

    }
}
