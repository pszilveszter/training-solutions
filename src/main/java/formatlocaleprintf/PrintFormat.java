package formatlocaleprintf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;

public class PrintFormat {
    public String checkException(String formatString, Integer i, Integer j) {
        try {
            return String.format(formatString, i, j);
        }
        catch (MissingFormatArgumentException e) {
            throw new IllegalArgumentException("Less objects then expected in format String!");
        }
    }

    public String printFormattedText(Double number) {
        Locale lang = new Locale("hu", "HU");
        return String.format(lang,"Total is: %,.2f Ft", number).replace("\u00A0", " "); //Since 561 123,20 is not eqaul to 561 123,20
    }

    public String printFormattedText(int count, String fruit) {
        return String.format("We counted %d %s in the basket", count, fruit);
    }

    public String printFormattedText(int number) {
        return String.format("Right edge of numbers set at 4 spaces from text:%4d", number);
    }

    public String printFormattedText(Integer i, Integer j, Integer k) {
        return  String.format("Multiple objects containing text:%d\t%d\t%d",i ,j, k);
    }

    public String formatMessageWithIntegerParameters(String s, int i, int j) {
        return checkException(s, i, j);
    }
}
