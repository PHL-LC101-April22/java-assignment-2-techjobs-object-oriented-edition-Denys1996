package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        super(value);
        super.setValue(value);
    }

    //Getters and Setters
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
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}