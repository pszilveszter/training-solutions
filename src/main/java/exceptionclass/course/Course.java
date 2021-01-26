package exceptionclass.course;

public class Course {
    private final String name;
    private final SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        if (name == null || begin == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return this.begin + ": " + this.name;
    }
}
