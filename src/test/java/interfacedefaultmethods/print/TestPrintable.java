package interfacedefaultmethods.print;

public class TestPrintable implements Printable {

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String getPage(int i) {
        return null;
    }
}
