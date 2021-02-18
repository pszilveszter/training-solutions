package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activityList;

    public Activities(List<Activity> activities) {
        this.activityList = activities;
    }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (ActivityType at: List.of(ActivityType.values())) {
            double distance = 0;
            for (Activity a: activityList) {
                if (at.name().equals(a.getType().toString())) {
                    distance += a.getDistance();
                }
            }
            reports.add(new Report(at, distance));
        }
        return reports;
    }

    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity a: activityList) {
            if (a instanceof ActivityWithTrack) {
                count++;
            }
        }
        return count;
    }

    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity a: activityList) {
            if (a instanceof ActivityWithoutTrack) {
                count++;
            }
        }
        return count;
    }
}
