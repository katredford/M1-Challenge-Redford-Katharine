package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior claudia;

    @Before
    public void setUp() {
        claudia = new Warrior("claudia");
    }

    @Test
    public void testingPlainConstable(){
        assertEquals("claudia", claudia.getName());
        assertEquals(75, claudia.getStrength());
        assertEquals(100, claudia.getHealth());
        assertEquals(100, claudia.getStamina());
        assertEquals(50, claudia.getSpeed());
        assertEquals(10, claudia.getAttackPower());
        assertEquals(false, claudia.isArrested());
        assertEquals(false, claudia.isRunning());

    }
}