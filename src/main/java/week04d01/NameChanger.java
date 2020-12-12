package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName.isEmpty() || !fullName.contains(" ")) {
            throw new IllegalArgumentException("Invalid name: " + fullName);
        }
        this.fullName = fullName;
    }

    public void changeFirstName(String firstName) {
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }
}
