package schoolrecords;

public class Subject {

    private String subjectName;


    public Subject(String subjectName) {
        if (isEmpty(subjectName)) {
            throw new IllegalArgumentException("Empty name is not accepted!");
        }
        this.subjectName = subjectName;
    }


    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public String getSubjectName() {
        return subjectName;
    }


}
