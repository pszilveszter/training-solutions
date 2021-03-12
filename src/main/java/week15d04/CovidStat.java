package week15d04;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class CovidStat {

    private static final String LINE_SEPARATOR = ",(?=\\S)"; // Tök jó feladat, de az órán megoldott példa nem újrafelhasználható, illetve hogy az legyen nagyon sokat kíván a feladat!!! :-(
    private Map<Continent, Map<Country, List<Case>>> report = new HashMap<>();


    public CovidStat(InputStream input) {
        readFile(input);
    }


    public Map<Continent, Map<Country, List<Case>>> getReport() {
        return Map.copyOf(report);
    }


    public List<String> top3WeekByCountry(String country) {
        Country c = new Country(country, "");
        if (report.isEmpty()) {
            throw new IllegalArgumentException("No available data");
        }
        Iterator<Map<Country, List<Case>>> i = report.values().stream().iterator();
        while (i.hasNext()) {
            Map<Country, List<Case>> actual = i.next();
            if (actual.containsKey(c)) {
                Map<String, Integer> weeklyDataOfCountry = getWeeklyReportFor(actual.get(c));
                return getTop3(weeklyDataOfCountry);
            }
        }
        throw new IllegalArgumentException("No data prevailed for such country: " + country);
    }


    private List<String> getTop3(Map<String, Integer> weeklyDataOfCountry) {
        List<Integer> values = new ArrayList<>(weeklyDataOfCountry.values());
        Collections.sort(values);
        Collections.reverse(values);
        List<Integer> top3 = values.subList(0, 3);

        Iterator<Map.Entry<String, Integer>> item = weeklyDataOfCountry.entrySet().iterator();
        List<String> result = new ArrayList<>();

        while (result.size() < 3 && item.hasNext()) {
            Map.Entry<String, Integer> data = item.next();
            if (top3.contains(data.getValue())) {
                result.add(String.format("%d cases on week %s", data.getValue(), data.getKey()));
            }
        }
        return result;
    }


    private Map<String, Integer> getWeeklyReportFor(List<Case> countryCases) {
        Map<String, Integer> weeklyData = new HashMap<>();
        for (Case c: countryCases) {
            String weekNum = getWeekNumber(c.getDate());
            if (!weeklyData.containsKey(weekNum)) {
                weeklyData.put(weekNum, 0);
            }
            weeklyData.replace(weekNum, weeklyData.get(weekNum) + c.getCases());
        }
        return weeklyData;
    }


    private String getWeekNumber(LocalDate d) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.set(Calendar.YEAR, d.getYear());
        calendar.set(Calendar.MONTH, d.getMonthValue() - 1);
        calendar.set(Calendar.DAY_OF_MONTH, d.getDayOfMonth());
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

        int year = d.getYear();
        if (d.getMonthValue() == 12) {
            year++;
        }
        if (d.getMonthValue() == 1 && weekOfYear > 52) {
            year--;
        }
        return String.format("%d/%d", year, weekOfYear);
    }


    private void readFile(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                fillMap(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read from source", ioe);
        }
    }


    private void fillMap(String line) {
        try {
            String[] data = line.split(LINE_SEPARATOR);
            Continent continent = getContinent(data);
            if (!report.containsKey(continent)) {
                report.put(continent, new HashMap<>());
            }

            Country country = getCountry(data);
            if (!report.get(continent).containsKey(country)) {
                report.get(continent).put(country, new ArrayList<>());
            }

            report.get(continent).get(country).add(getCase(data));
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Unable to parse number: " + line, nfe);
        }
        catch (IndexOutOfBoundsException ioe) {
            throw new IllegalArgumentException("Unable to parst line: " + line, ioe);
        }
    }


    private Continent getContinent(String... input) {
        if (input[Position.CONTINENT.ordinal()].contains(",")) {
            return new Continent(input[Position.CONTINENT.ordinal()].substring(0, input[Position.CONTINENT.ordinal()].length() - 1));
        }
        return new Continent(input[Position.CONTINENT.ordinal()]);
    }


    private Country getCountry(String... input) {
        if (input[Position.COUNTRY_CODE.ordinal()] == null || input[Position.POPULATION.ordinal()].isBlank()) {
            return new Country(input[Position.COUNTRY_NAME.ordinal()],
                    input[Position.GEO.ordinal()]);
        }
        return new Country(input[Position.COUNTRY_NAME.ordinal()],
                input[Position.GEO.ordinal()],
                input[Position.COUNTRY_CODE.ordinal()],
                Integer.parseInt(input[Position.POPULATION.ordinal()]));
    }


    private Case getCase(String... input) {
        return new Case(
                LocalDate.of(Integer.parseInt(input[Position.YEAR.ordinal()])
                        , Integer.parseInt(input[Position.MONTH.ordinal()])
                        , Integer.parseInt(input[Position.DAY.ordinal()]))
                , Integer.parseInt(input[Position.CASE.ordinal()])
                , Integer.parseInt(input[Position.DEATH.ordinal()]));
    }

}
