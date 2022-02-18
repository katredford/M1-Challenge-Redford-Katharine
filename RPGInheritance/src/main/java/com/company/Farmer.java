package com.company;

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

}

