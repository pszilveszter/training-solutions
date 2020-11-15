package introconstructors;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task {
    private String title;
    private String descirption;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String descirption) {
        this.title = title;
        this.descirption = descirption;
    }


    public static void main(String[] args) {
        Task task = new Task("Tanulás", "Java kurzusok elvégzése");
        task.start();
        task.setDuration(1000);
        System.out.println(task.getTitle());
        System.out.println(task.getDescirption());
        System.out.println("\tIdőtartam: " + task.getDuration());
        System.out.println("\tKezdési időpont:\t" + task.getStartDateTime());
        System.out.println("\tVárható befejezés:\t" + task.getStartDateTime().plusHours(task.getDuration()));
    }

    public String getTitle() {
        return title;
    }

    public String getDescirption() {
        return descirption;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        this.startDateTime = LocalDateTime.now();
    }
}
