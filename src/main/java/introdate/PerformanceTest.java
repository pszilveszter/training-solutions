package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performnce = new Performance(LocalDate.of(1989,06,02),"Queen", LocalTime.of(18,0), LocalTime.of(20,0));
        System.out.print("Előadó: " + performnce.getArtist() + "; ");
        System.out.print("Dátum: " + performnce.getDate() + "; ");
        System.out.print("Kezdete: " + performnce.getStartTime() + "; ");
        System.out.print("Vége: " + performnce.getEndTime());
        System.out.println();
        System.out.print(performnce.getInfo());
    }
}
