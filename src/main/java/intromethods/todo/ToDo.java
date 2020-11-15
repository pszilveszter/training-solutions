package intromethods.todo;

public class ToDo {
    private String caption;
    private boolean finished;

    public ToDo(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public Boolean isFinished() {
        return finished;
    }

    public void finish() {
        finished = true;
    }

    @Override
    public String toString() {
        return caption + "(" + (finished ? "KÉSZ" : "Folyamatban") + ")";
    }
}
