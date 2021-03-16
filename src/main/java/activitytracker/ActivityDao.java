package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

public class ActivityDao {

    private MariaDbDataSource ds;

    public ActivityDao(MariaDbDataSource ds) {
        this.ds = ds;
    }

    public List<Activity> readAll() {
        try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM activities ORDER BY id")
        ) {
            return listActivities(ps);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Could not read data", se);
        }
    }


    public Activity findActivityById(long id) {
        try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM activities WHERE id = ?")
        ) {
            ps.setLong(1, id);
            List<Activity> activities = listActivities(ps);
            if (activities.size() == 1) {
                return activities.get(0);
            }
            throw new IllegalStateException("No record with id: " + id);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Could not read data", se);
        }
    }


    public Activity saveActivity(Activity newActivity) {
        try (Connection con = ds.getConnection();
             PreparedStatement script = con.prepareStatement("INSERT INTO activities VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)
        ) {
            insertActivity(script, newActivity);
            try (ResultSet rs = script.getGeneratedKeys()) {
                if (rs.next()) {
                    long id = rs.getLong(1);
                    return new Activity(id, newActivity.getStartTime(), newActivity.getDesc(), newActivity.getType());

                }
            }
            throw new IllegalStateException("Could not get key");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to insert record", se);
        }
    }

    private List<Activity> listActivities(PreparedStatement ps) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(new Activity(
                        rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type"))));
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Could not retrieve record", se);
        }
    }


    private void insertActivity(PreparedStatement script, Activity a) {
        try {
            script.setLong(1, NULL);
            script.setTimestamp(2, Timestamp.valueOf(a.getStartTime()));
            script.setString(3, a.getDesc());
            script.setString(4, a.getType().toString());
            script.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Could not insert data: " + a.toString(), se);
        }
    }
}
