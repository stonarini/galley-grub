package edu.poniperro.galleygrub.extras;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ExtrasTest {

    private static List<String> extras = new ArrayList<String>(List.of(
            "CHEESE",
            "SAUCE",
            "LARGE"));

    private static List<Double> prices = new ArrayList<Double>(List.of(
            0.25,
            0.50,
            0.50));

    @Test
    public void testExtrasName() {
        assertEquals(Extras.CHEESE.name(), extras.get(Extras.CHEESE.ordinal()));
        assertEquals(Extras.CHEESE.lowercaseName(), extras.get(Extras.CHEESE.ordinal()).toLowerCase());

        assertEquals(Extras.LARGE.name(), extras.get(Extras.LARGE.ordinal()));
        assertEquals(Extras.LARGE.lowercaseName(), extras.get(Extras.LARGE.ordinal()).toLowerCase());
    }

    @Test
    public void testExtrasPrices() {
        assertEquals(Extras.CHEESE.getPrice(), prices.get(Extras.CHEESE.ordinal()));
        assertEquals(Extras.LARGE.getPrice(), prices.get(Extras.LARGE.ordinal()));
    }

}
