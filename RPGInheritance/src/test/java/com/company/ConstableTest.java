package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable chad;

    @Before
    public void setUp() throws Exception {
        chad = new Constable("chad", "town");
    }

    @Test
    public void testingPlainConstable(){
        assertEquals("chad", chad.getName());
        assertEquals(60, chad.getStrength());
        assertEquals(100, chad.getHealth());
        assertEquals(20, chad.getSpeed());
        assertEquals(5, chad.getAttackPower());
        assertEquals(false, chad.isArrested());
        assertEquals(false, chad.isRunning());

    }
}