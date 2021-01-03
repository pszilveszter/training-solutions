package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable {

    private List<String> contents = new ArrayList<>();

    @Override
    public int getLength() {
        return contents.size();
    }

    @Override
    public String getPage(int i) {
        return contents.get(i);
    }

    public void addPage(String content) {
        contents.add(content);
    }
}
