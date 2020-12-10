package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        completed = true;
        this.completedAt = completedAt;
    }


    public void complete() {
        completedAt = LocalDate.now();
        completed = true;
    }

    public void complete(LocalDate at) {
        completedAt = at;
        completed = true;
    }


    @Override
    public String toString() {
        if (completed) {
            return String.format("%s is completed on %d-%d-%d", title, completedAt.getYear(), completedAt.getMonthValue(), completedAt.getDayOfMonth());
        }
        return String.format("%s is not yet completed", title);
    }
}
