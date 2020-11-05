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
        int iLen = email.length();
        int iAt = email.indexOf("@");
        int iDot = email.indexOf(".");
        return (iAt > 0)
                && (iDot > iAt + 1)
                && (iDot + 1 != iLen);
    }

}
