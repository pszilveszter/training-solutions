package week13d03;

public class Schedule {

    private final String teacher;
    private final String course;
    private final String classId;
    private final int hours;

    public Schedule(String teacher, String course, String classId, int hours) {
        this.teacher = teacher;
        this.course = course;
        this.classId = classId;
        this.hours = hours;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getCourse() {
        return course;
    }

    public String getClassId() {
        return classId;
    }

    public int getHours() {
        return hours;
    }
}
