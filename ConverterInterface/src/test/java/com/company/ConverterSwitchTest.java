package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch converterSwitch;

    @Before
    public void setUp() throws Exception {
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void dayNumberBecomesDayWord(){
        assertEquals("Monday", converterSwitch.convertDay(2));
        assertEquals("Wednesday", converterSwitch.convertDay(4));
        assertEquals("Must be a number between 1 and 7", converterSwitch.convertDay(17));
    }

    @Test
    public void monthNumberBecomesMonthWord(){
        assertEquals("May", converterSwitch.convertMonth(5));
        assertEquals("March", converterSwitch.convertMonth(3));
        assertEquals("Must be a number between 1 and 12", converterSwitch.convertMonth(97));
    }
}