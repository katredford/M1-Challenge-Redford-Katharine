package com.company;

public class Warrior extends Character{

    private int shieldPoints;

    public Warrior(String name) {
        super(name, 75,100,100,50,10, false, false);
        this.shieldPoints = 100;
    }

    public void looseShieldPoints(Integer points) {

        this.shieldPoints -= points;
    }

    public int shieldPower() {

        return shieldPoints;
    }
}
