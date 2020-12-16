package constructoroverloading;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private static final int SCALE = 60;
    private List<SimpleTime> timeTable = new ArrayList<>();


    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        int nextTimeInMinute = timeInMinute(firstHour, everyMinute);
        while (nextTimeInMinute < lastHour * SCALE) {
            timeTable.add(new SimpleTime(nextTimeInMinute / SCALE, nextTimeInMinute % SCALE));
            nextTimeInMinute += everyMinute;
        }
    }

    public Object nextBus(SimpleTime simpleTime) {
        for (SimpleTime sd: timeTable) {
            if (sd.difference(simpleTime) > 0) {
                return sd;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }


    public SimpleTime firstBus() {
        SimpleTime firstBusAt = null;
        for (SimpleTime st: timeTable) {
            if (firstBusAt == null || st.difference(firstBusAt) < 0) {
                firstBusAt = st;
            }
        }
        return firstBusAt;
    }


    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    private int timeInMinute(int hrs, int min) {
        return hrs * SCALE + min;
    }
}
