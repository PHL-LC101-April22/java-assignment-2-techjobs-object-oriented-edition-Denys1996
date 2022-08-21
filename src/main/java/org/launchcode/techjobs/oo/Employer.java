package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

    //Constructors

    public Employer() {
        super();
    }

    public Employer(String value) {
        super(value);
        super.setValue(value);
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
    public String toString(){
        return super.getValue();
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId());
    }

}
