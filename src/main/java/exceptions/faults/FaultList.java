package exceptions.faults;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class FaultList {

    public List<String> processLines(List<String> lines) {
        if (lines == null) {
            throw new IllegalArgumentException();
        }
        List<String> result = new ArrayList<>();
        for (String line: lines) {
            String[] lineStream = line.split(",");
            ProcessingResult r = checkFault(lineStream);
            if (r != null) {
                result.add(lineStream[0] + "," + r.getCode());
            }
        }
        return result;
    }

    private ProcessingResult checkFault(String... s) {
        try {
            if (s.length != 3) {
                return ProcessingResult.WORD_COUNT_ERROR;
            }
            Integer.parseInt(s[0]);
            Double.parseDouble(s[1]);
            LocalDate.parse(s[2], DateTimeFormatter.ofPattern("yyyy.MM.d."));
        }
        catch (NumberFormatException nfo) {
           if (nfo.getStackTrace()[1].getMethodName().equals("parseInt")) {
               return null;
           }
           return checkFault("0","0", s[2]) != null ? ProcessingResult.VALUE_AND_DATE_ERROR : ProcessingResult.VALUE_ERROR;
        }
        catch (DateTimeParseException dpe) {
            return ProcessingResult.DATE_ERROR;
        }
        return null;
    }
}
