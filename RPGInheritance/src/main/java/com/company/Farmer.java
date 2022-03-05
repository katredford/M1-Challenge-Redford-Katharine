package com.company;

import java.util.Objects;

public class Farmer extends Character {

   boolean plowing;
   boolean harvesting;


    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1, false, false);
        this.plowing = false;
        this.harvesting = false;
    }

    public void plow(){
        this.plowing = true;
    }

    public boolean isPlowing() {
        System.out.println("plowing");
        return plowing;
    }

    public void harvest(){
        this.harvesting = true;
    }

    public boolean isHarvesting() {
        System.out.println("what a haul!");
        return harvesting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}

