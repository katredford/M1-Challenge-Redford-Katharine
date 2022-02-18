package com.company;

public class Character {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean arrested;
    private boolean running;

    public Character() {
        ;
    }

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower, boolean arrested, boolean running) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.arrested = false;
        this.running = false;

    }

    public void run() {
        System.out.println("now running");
    }

    public boolean arrested() {
        this.arrested = true;

        return true;
    }

    public boolean isArrested(){
        System.out.println("in jail");
        return arrested;
    }

    public void setArrested(boolean arrested){
        this.arrested = arrested;
    }

    public boolean running(){
        this.running = true;
        System.out.println("time to run");
        return running;
    }

    public boolean isRunning(){
        return running;
    }

    public void attack(Character enemy) {
        enemy.decreaseHealth(this.attackPower);
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void increaseStamina(int amount) {
        this.stamina += amount;
    }

    public void decreaseStamina(int amount) {
        this.stamina -= amount;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }


    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
