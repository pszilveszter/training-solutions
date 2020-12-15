package defaultconstructor;

public class SimpleDateFormatter {

    private static final String FORMAT = "%d-%d-%d";
    private CountryCode defaultCountry;

    public SimpleDateFormatter() {
        this.defaultCountry = CountryCode.HU;
    }


    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCountry, simpleDate);
    }


    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case EN:
                return String.format(FORMAT, simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
            case US:
                return String.format(FORMAT, simpleDate.getMonth(), simpleDate.getDay(), simpleDate.getYear());
            default:
                return String.format(FORMAT, simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
        }
    }

}
