package stringbuilder;

public class NameBuilder {

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder sb = new StringBuilder();
        if (title != null) {
            sb.append(title.getValue());
            sb.append(" ");
        }
        sb.append(givenName);
        sb.append(" ");
        if (!isEmpty(middleName)) {
            sb.append(middleName);
            sb.append(" ");
        }
        sb.append(familyName);
        return sb.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder sb = new StringBuilder();
        if (title != null && !isEmpty(title.getValue())) {
            sb.append(title.getValue());
            sb.append(" ");
        }
        sb.append(familyName);
        sb.append(" ");
        if (!isEmpty(middleName)) {
            sb.append(middleName);
            sb.append(" ");
        }
        sb.append(givenName);
        return sb.toString();
    }


    public String insertTitle(String name, Title title, String where) {
        StringBuilder sb = new StringBuilder(name);
        sb.insert(sb.indexOf(where) + 1, title.getValue() + " ");
        return sb.toString();
    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder sb = new StringBuilder(name);
        int startPos = sb.indexOf(delete);
        sb.delete(startPos, startPos + delete.length());
        return sb.toString();
    }
}
