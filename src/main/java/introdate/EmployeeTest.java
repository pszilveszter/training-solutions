package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sName;
        int iYear, iMonth, iDay;

        System.out.println("Név:");
        sName = scanner.nextLine();
        System.out.println("Születés éve:");
        iYear = scanner.nextInt();
        System.out.println("Születés hónapja:");
        iMonth = scanner.nextInt();
        System.out.println("Születési napja:");
        iDay = scanner.nextInt();

        Employee employee = new Employee(iYear,iMonth,iDay,sName);

        System.out.println("Név: " + employee.getName()
                            + "\nSzületett: " + employee.getDateOfBirth()
                            + "\nBelépett: " + employee.getBeginEmployment());

    }
}
