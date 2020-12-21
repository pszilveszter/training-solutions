package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();
    private int cursorPosition;

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursorPosition = - 1;
    }

    public boolean hasNext() {
        return size() > cursorPosition + 1;
    }

    public Object next() {
        if (hasNext()) {
            return items.get(++cursorPosition);
        }
        throw new IllegalStateException("No next found!");
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor() {
        return cursorPosition;
    }

}
