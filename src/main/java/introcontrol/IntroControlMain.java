package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl control = new IntroControl();

        int x = 11;
        System.out.println(control.substractTenIfGreaterThanTen(x));

        int y = 0;
        System.out.println(control.describeNumber(x));
        System.out.println(control.describeNumber(y));

        String nameA = "Donald";
        String nameB = "Joe";
        System.out.println(control.greetingToJoe(nameA));
        System.out.println(control.greetingToJoe(nameB));

        int q1 = 999_999;
        int q2 = 1_000_000;
        System.out.println(control.calculateBonus(q1));
        System.out.println(control.calculateBonus(q2));

        int prev1 = 1;
        int next1 = 9999;
        int prev2 = 9999;
        int next2 = 10000;
        System.out.println("calculateConsumption: " + control.calculateConsumption(prev1,next1));
        System.out.println("calculateConsumption: " + control.calculateConsumption(prev2,next2));

        control.printNumbers(x);
        control.printNumbersBetween(prev1, x);

        control.printNumbersBetweenAnyDirection(prev1,x);
        control.printNumbersBetweenAnyDirection(x, prev1);

        control.printOddNumbers(x);
        control.printOddNumbers(next1);
    }
}
