package week15d04;

import java.util.Objects;

public class Continent {

    private String name;

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(getName(), continent.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
