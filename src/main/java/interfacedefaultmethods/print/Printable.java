package interfacedefaultmethods.print;

public interface Printable {

    String BLACK = "#000000";

    int getLength();

    String getPage(int i);

    default String getColor(int i) {
        return BLACK;
    }
}
