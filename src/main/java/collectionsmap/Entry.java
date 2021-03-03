package collectionsmap;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Objects;

public class Entry implements Comparable<Entry> {

    private String ipAddress;
    private LocalDate entryDate;
    private String login;

    public Entry(String ipAddress, LocalDate entryDate, String login) {
        this.ipAddress = ipAddress;
        this.entryDate = entryDate;
        this.login = login;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public int compareTo(@NotNull Entry e) {
        return ipAddress.compareTo(e.ipAddress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(ipAddress, entry.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress);
    }
}
