package com.company.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Test
    public void getIceCream(){
        String[] ingredients = new String[] {"cocoa","sugar","milk",};
        IceCream iceCream = new IceCream("chocolate", 2.5, .50, 2, ingredients);

        assertEquals("chocolate", iceCream.getFlavor());
        assertEquals(2.5, iceCream.getSalePrice(), .01);
        assertEquals(.50, iceCream.getProductionCost(), .01);
        assertEquals(2, iceCream.getProductionTime());
        assertArrayEquals( ingredients, iceCream.getIngredients());

    }

    @Test
    public void profitFromSale() {
        String[] ingredients = new String[] {"cocoa","sugar","milk",};
        IceCream iceCream = new IceCream("chocolate", 2.5, .50, 2, ingredients);

        assertEquals(2, iceCream.profit(2.5,.50),.01);
    }

}