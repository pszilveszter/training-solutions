package interfacedefaultmethods.print;

public class ColoredPage {

    private final String content;
    private final String pageColor;

    public ColoredPage(String content, String pageColor) {
        this.content = content;
        this.pageColor = pageColor;
    }

    public String getContent() {
        return content;
    }

    public String getPageColor() {
        return pageColor;
    }
}
