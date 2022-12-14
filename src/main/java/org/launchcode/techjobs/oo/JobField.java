package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private String value;
    private int id;
    private static int nextId= 1;

    //Contractors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        this.value =  aValue;
    }

    //Getter and Setters

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    //Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return value;
    }
}
