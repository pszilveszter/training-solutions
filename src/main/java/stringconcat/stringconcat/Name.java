package stringconcat.stringconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String s = "";

        if (title != null) {
            s += title.getName() + " ";
        }

        s += givenName + " ";

        if (!isEmpty(middleName)) {
            s += middleName + " ";
        }

        return s + familyName;
    }

    public String concatNameHungarianStyle() {
        String s = "";

        if (title != null) {
            s = title.getName().concat(" ");
        }

        s = s.concat(familyName.concat(" "));

        if (!isEmpty(middleName)) {
            s = s.concat(middleName.concat(" "));
        }
        return s.concat(givenName);
    }

    private boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
