package stringbasic.stringbasic;

public class StringCreator {
    public String createStringForPool() {
        String pool = "intern";
        return pool;
    }

    public String createStringForHeap() {
        String heap = new String("intern");
        return heap;
    }
}
