package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
   Farmer brittany;

   @Before
   public void setUp() throws Exception {
       brittany = new Farmer("brittany");
   }

   @Test
   public void testingPlainFarmer(){
       assertEquals("brittany", brittany.getName());
       assertEquals(75, brittany.getStrength());
       assertEquals(100, brittany.getHealth());
       assertEquals(10, brittany.getSpeed());
       assertEquals(1, brittany.getAttackPower());
       assertEquals(false, brittany.isPlowing());
       assertEquals(false, brittany.isHarvesting());
       assertEquals(false, brittany.isArrested());
       assertEquals(false, brittany.isRunning());

   }

    @Test
    public void farmerIsPlowing() {
        assertEquals(false, brittany.isPlowing());
        brittany.plow();
        assertEquals(true, brittany.isPlowing());

    }

}