package week08d04;

public class GoodMood implements CanMark {

    private int mark;

    public GoodMood() {
        mark = 5;
    }

    @Override
    public int giveMark() {
        return mark;
    }
}
