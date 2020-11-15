package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("Test Elek", "2020", 290_000);
        System.out.println(e);

        e.setName("Remek Elek");
        e.raiseSalary(50_000);
        System.out.println("Name = " + e.getName());
        System.out.println("Hiring Year = " + e.getHiringYear());
        System.out.println("Salary = " + e.getSalary());
    }
}
