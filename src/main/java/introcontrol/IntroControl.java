package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThanTen(int number) {
        int x = 10;

        if (!(number > x)) {
            return number;
        }
        return  number - x;
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        }
        return "not zero";
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        }
        return "";
    }

    public int calculateBonus(int sale) {
        int min = 1_000_000;
        if (!(sale < min)) {
            sale = sale / 10;
        } else {
            sale = 0;
        }
        return sale;
    }

    public int calculateConsumption(int prev, int next) { // JAVÍTVA SAMPLE ALAPJÁN
        if (prev <= next) {
            return next - prev;
        } else {
            return 10_000 - prev + next;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i + ";");
        }
        System.out.println();
    }

    public void printNumbersBetween(int min, int max) {
            for (;min <= max; min++) System.out.print(min + ";");
        System.out.println();
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a < b) {
            for (;a <= b; a++) {
                System.out.print(a + ";");
            }
        } else {
            for (;a >= b; a--) {
                System.out.print(a + ";");
            }
        }
        System.out.println();
    }

    public void printOddNumbers(int max) {
        if (max % 2 == 1) {
            System.out.println("páratlan");
            for (int i = 1; i <= max; i = i + 2) {
                System.out.print(i + ";");
            }
            System.out.println();
        } else {
            System.out.println("páros");
        }
    }
}
