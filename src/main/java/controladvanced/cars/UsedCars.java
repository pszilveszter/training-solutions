package controladvanced.cars;

import java.util.ArrayList;
import java.util.List;

public class UsedCars {
    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        boolean isValid = true;

        for (String line: lines) {
            String[] parts = line.split(";");
            if(parts.length != 4) {
                isValid = false;
            }

            if (parts[0].length() != 7 || parts[0].indexOf("-") < 0) {
                isValid = false;
            }

            if (Integer.parseInt(parts[1]) >= 2019 || Integer.parseInt(parts[1]) <= 1970) {
                isValid = false;
            }

            if (!isValid) {
                continue;
            }

            validLines.add(line);
        }
        return validLines;
    }
}
