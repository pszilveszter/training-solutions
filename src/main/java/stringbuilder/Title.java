package stringbuilder;

public enum Title {
    MR("Mr."), MS("Ms."), DR("Dr."), PROF("Prof.");

    private String value;

    Title(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
