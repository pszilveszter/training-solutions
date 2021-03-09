package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem tsi) {
        this.employee = tsi.employee;
        this.project = tsi.project;
        this.from = tsi.from;
        this.to = tsi.to;
    }


    public static TimeSheetItem withDifferentDay(TimeSheetItem original, LocalDate ld) {
        TimeSheetItem clone = new TimeSheetItem(original);
        clone.from = LocalDateTime.of(ld, clone.from.toLocalTime());
        clone.to = LocalDateTime.of(ld, clone.to.toLocalTime());
        return clone;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
