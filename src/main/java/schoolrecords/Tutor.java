package schoolrecords;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects;


    public Tutor(String name, List<Subject> taughtSubjects) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Empty name is not accepted!");
        }
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }


    public boolean tutorTeachingSubject(Subject subject) {
        int subjects = taughtSubjects.size() - 1;
        boolean isTeaching = false;
        String subjectName = subject.getSubjectName();
        while (!isTeaching && subjects >= 0) {
            String taughtObjectName = taughtSubjects.get(subjects).getSubjectName();
            isTeaching = subjectName.equals(taughtObjectName);
            subjects--;
        }
        return isTeaching;
    }


    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public String getName() {
        return name;
    }
}
