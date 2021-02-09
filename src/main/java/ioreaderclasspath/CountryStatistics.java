package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countries = new ArrayList<>();

    public void readFromFile(String strName) {
       try (BufferedReader reader = new BufferedReader(
               new InputStreamReader(CountryStatistics.class.getResourceAsStream("/" + strName)))) {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] data = line.split(" ");
               countries.add(new Country(data[0],  Integer.parseInt(data[1])));
           }
       }
       catch (IOException ioe) {
           throw new IllegalStateException("Unable to read file, ioe");
       }
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countries);
    }

    public int numberOFCountries() {
        return countries.size();
    }


    public Country mostBorderCountries() {
        Country result = countries.get(0);
        for (Country country: countries) {
            if (country.getBorderCountries() > result.getBorderCountries()) {
                result = country;
            }
        }
        return result;
    }
}
