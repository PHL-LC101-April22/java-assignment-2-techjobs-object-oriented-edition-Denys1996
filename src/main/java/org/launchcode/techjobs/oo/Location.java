package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{

    public Location() {
        super();
    }

    public Location(String newValue) {
        super(newValue);
        super.setValue(newValue);
    }

    // Getters and Setters:
    public int getId() {
        return super.getId();
    }

    public String getValue() {
        return super.getValue();
    }

    public void setValue(String value) {
        super.setValue(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return super.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId());
    }


}
