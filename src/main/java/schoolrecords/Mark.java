package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;


    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (markType == null || subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }

        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }


    public Mark(String markType, Subject subject, Tutor tutor) {
        if (isEmpty(markType)) {
            throw new IllegalArgumentException("Mark can not inicialized with empty marktype string!");
        }
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }

        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
        this.tutor = tutor;
    }


    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public MarkType getMarkType() {
        return markType;
    }


    public Subject getSubject() {
        return subject;
    }


    public Tutor getTutor() {
        return tutor;
    }


    @Override
    public String toString() {
        return markType.getDescription() + "(" + markType.getValue() + ")";
    }
}
