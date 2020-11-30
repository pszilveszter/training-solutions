package introexception.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is not provided");
        }

        if (year <= 1900) {
            throw new IllegalArgumentException("Year of birth " + year + " is not supported!");
        }

        SsnValidator sn = new SsnValidator();
        if (!sn.isValidSsn(ssn)) {
            throw new IllegalArgumentException("Invalid SSN: " + ssn);
        }

        this.name = name;
        socialSecurityNumber = ssn;
        yearOfBirth = year;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
