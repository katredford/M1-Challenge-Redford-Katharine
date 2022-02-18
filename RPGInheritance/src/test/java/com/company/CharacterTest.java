package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    Farmer brittany;
    Constable chad;
    Warrior claudia;

    @Before
    public void setUp() throws Exception{
        brittany = new Farmer("brittany");
        chad = new Constable("chad", "town");
        claudia = new Warrior("claudia");
    }

    @Test
    public void gettingAttacked(){
        claudia.attack(chad);
        assertEquals(90, chad.getHealth());
        claudia.attack(brittany);
        assertEquals(90, brittany.getHealth());
        chad.attack(claudia);
        assertEquals(95, claudia.getHealth());
    }

    @Test
    public void constableArrestingCitizens(){
        chad.arrest(brittany);
        chad.arrest(claudia);

        assertEquals(true, brittany.isArrested());
        assertEquals(true, claudia.isArrested());

    }
}