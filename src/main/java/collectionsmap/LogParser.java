package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {

    private static final int FIELDS_SIZE = 3;
    private static final int POS_IP = 0;
    private static final int POS_DATE = 1;
    private static final int POS_LOGIN = 2;
    private static final String FIELDS_DELIMITER = ":";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ISO_DATE;


    public Map<String, List<Entry>> parseLog(String log) {

        List<Entry> el = new ArrayList<>();
        for (String s: log.split("\n")) {
            el.add(parseEntity(s));
        }
        Collections.sort(el);

        int from = 0;
        Map<String, List<Entry>> result = new HashMap<>();
        for (int i = 1; i < el.size(); i++) {
            if (!el.get(i).equals(el.get(i - 1))) {
                result.put(el.get(i - 1).getIpAddress(), el.subList(from, i));
                from = i;
            }
        }

        result.put(el.get(el.size() - 1).getIpAddress(), el.subList(from, el.size()));
        return result;
    }


    private Entry parseEntity(String s) {
        String[] records = s.split(FIELDS_DELIMITER);
        if (records.length != FIELDS_SIZE) {
            throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
        }
        try {
            LocalDate ld = LocalDate.parse(records[POS_DATE], DATE_FORMAT);
            return new Entry(records[POS_IP], ld, records[POS_LOGIN]);
        }
        catch (DateTimeParseException dtp) {
            throw new IllegalArgumentException("Incorrect log: incorrect date", dtp);
        }
    }
}