package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable {

    private List<ColoredPage> contents = new ArrayList<>();

    @Override
    public int getLength() {
        return contents.size();
    }

    @Override
    public String getPage(int i) {
        return contents.get(i).getContent();
    }

    @Override
    public String getColor(int i) {
        return contents.get(i).getPageColor();
    }

    public void addPage(String pageContent, String pageColor) {
        ColoredPage coloredPage = new ColoredPage(pageContent, pageColor);
        contents.add(coloredPage);
    }
}
