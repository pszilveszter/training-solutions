package stringconcat.stringconcat;

public enum Title {
    MR("Mr."), MS("Ms."), DR("Dr.");

    private String name;

    Title(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
