package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
    Item krabbyPatty;

    @Before
    public void setup() {
        this.krabbyPatty = new Item("Krabby Patty", 1.25);
    }

    @Test
    public void isRegularItemTest() {
        assertTrue(krabbyPatty.isRegular());
    }

    @Test
    public void isNotRegularItemTest() {
        Item krabbyPattyWithCheese = new Item("Krabby Patty", 1.25, "cheese");
        assertFalse(krabbyPattyWithCheese.isRegular());
    }

    @Test
    public void itemEqualsItemTest() {
        Item krabbyMeal = new Item("Krabby Meal", 3.5);
        Item otherKrabbyPatty = new Item("Krabby Patty", 1.25);
        assertFalse(krabbyPatty.equals(krabbyMeal));
        assertTrue(krabbyPatty.equals(otherKrabbyPatty));
    }

}
