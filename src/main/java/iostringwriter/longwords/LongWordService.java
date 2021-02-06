package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {


    public String writeWithStringWriter(List<String> testWords) {
        StringWriter sw = new StringWriter();
        try (sw) {
             writeOf(testWords, sw);
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to write");
        }
        return sw.toString();
    }

    private void writeOf(List<String> words, Writer writer) {
        PrintWriter pw = new PrintWriter(writer);
        for (String word: words) {
            pw.print(word);
            pw.println(word.length());
        }
    }
}
