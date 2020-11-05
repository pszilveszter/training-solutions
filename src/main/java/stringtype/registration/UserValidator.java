package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username) {
        int h = username.length();
        return h > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        int h = password1.length();
        boolean e = password1.equals(password2);
        return h >= 8 && e;
    }

    public boolean isValidEmail(String email) {
        return true;
    }

}
