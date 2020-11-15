package attributes.person;

public class Address {
    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String addressToString() {
        return country + " " + city + " " + streetAndNumber + " " + zipCode;
    }

    public void correctData(String country, String city, String streetAndNumber, String zipCode) {
        setCountry(country);
        setCity(city);
        setStreetAndNumber(streetAndNumber);
        setZipCode(zipCode);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
