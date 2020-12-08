package week07d02;

public class DigitSum {

    public int sumOfDigits(int x) {
        int sum = 0;
        x = Math.abs(x);
        String number = Integer.toString(x);
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.charAt(i) + "");
        }
        return  sum;
    }

    public int sumOfDigitsMath(int x) {
        int sum = 0;
        x = Math.abs(x);
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return  sum;
    }
}
