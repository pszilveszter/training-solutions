package introexception.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {

        int x = ssn.length();
        if (x != 9) {
            return false;
        }

        int checknum = 0;
        int number = 0;

        try {
            for (int i = 0; i < x - 1; i++) {
                number = Integer.parseInt(ssn.substring(i, i + 1));
                if (i % 2 == 0) {
                    checknum += number * 3;
                } else {
                    checknum += number * 7;
                }
            }
            return checknum % 10 == Integer.parseInt(ssn.substring(x - 1));
        }
        catch (IllegalArgumentException iae) {
            return false;
        }
    }
}
