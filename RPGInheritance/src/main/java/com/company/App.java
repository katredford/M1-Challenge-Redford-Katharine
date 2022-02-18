package com.company;

public class App {
    public static void main(String[] args) {
        Character care = new Character();
        Farmer farm = new Farmer("greg");
        care.arrested();

        farm.isArrested();

        System.out.println(farm);
    }
}
