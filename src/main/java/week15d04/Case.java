package week15d04;

import java.time.LocalDate;

public class Case {

    private LocalDate date;
    private int cases;
    private int deaths;

    public Case(LocalDate date, int cases, int deaths) {
        this.date = date;
        this.cases = cases;
        this.deaths = deaths;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getCases() {
        return cases;
    }

    public int getDeaths() {
        return deaths;
    }
}
