package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        if (email.indexOf("@") == -1 || email.lastIndexOf(".") < email.indexOf("@")) {
            throw new IllegalArgumentException(email + " is not a valid email address!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
