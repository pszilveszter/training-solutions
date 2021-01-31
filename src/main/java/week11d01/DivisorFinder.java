package week11d01;

public class DivisorFinder {

    public int findDivisors(int n) {
        int count = 0;
        String strNum = Integer.toString(n);
        for (int i = 0; i < strNum.length(); i++) {
            int num = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            if (n % num == 0) {
                count++;
            }
        }
        return count;
    }
}
