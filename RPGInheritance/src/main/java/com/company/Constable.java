package com.company;

import java.util.Objects;

public class Constable extends Character{


    private String jurisdiction;



    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5, false, false);
        this.jurisdiction = jurisdiction;
    }



    public void arrest(Character citizen) {
        citizen.setArrested(true);
        citizen.isArrested();
    }

    public String getJurisdiction() {

        return jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
