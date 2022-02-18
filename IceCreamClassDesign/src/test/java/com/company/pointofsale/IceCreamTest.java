package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void getIceCream(){
        IceCream iceCream = new IceCream("chocolate", 3.25, 10);

        assertEquals("chocolate", iceCream.getFlavor());
        assertEquals(3.25, iceCream.getPrice(), 0.1);
        assertEquals( 10, iceCream.getQuantity());
    }

    @Test
    public void howManyUnitsOfIceCream(){
        IceCream iceCream = new IceCream("chocolate", 3.25, 10);

        assertEquals(9, iceCream.soldPint());

    }
}