package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf converterIf;

    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();
    }


    @Test
    public void dayNumberBecomesDayWord(){
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Wednesday", converterIf.convertDay(4));
        assertEquals("Must be a number between 1 and 7", converterIf.convertDay(17));
    }

    @Test
    public void monthNumberBecomesMonthWord(){
        assertEquals("May", converterIf.convertMonth(5));
        assertEquals("March", converterIf.convertMonth(3));
        assertEquals("Must be a number between 1 and 12", converterIf.convertMonth(97));
    }

}