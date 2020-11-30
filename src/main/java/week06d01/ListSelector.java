package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {
    public String evenString (List<String> text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }

        if (text.size() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (String data : text) {
            if (text.indexOf(data) % 2 == 0) {
                sb.append(data + ",");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
