package week08d04;

public class BadMood implements CanMark {

    private int mark;

    public BadMood() {
        mark = 3;
    }

    @Override
    public int giveMark() {
        return mark;
    }
}
