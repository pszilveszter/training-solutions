package week15d04;

import java.util.Objects;

public class Country {

    private String name;
    private String geoID;
    private String countryCode;
    private int population;


    public Country(String name, String geoID) {
        this.name = name;
        this.geoID = geoID;
    }


    public Country(String name, String geoID, String countryCode, int population) {
        this(name, geoID);
        this.countryCode = countryCode;
        this.population = population;
    }




    public String getName() {
        return name;
    }

    public String getGeoID() {
        return geoID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(getName(), country.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
