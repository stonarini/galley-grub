package edu.poniperro.galleygrub.order;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.galleygrub.items.Item;

public class OrderTest {
    Order order;
    List<Item> items;

    @Before
    public void setup() {
        this.order = new Order();
        this.items = new ArrayList<Item>(List.of(new Item("Krabby Patty", 1.25), new Item("Salty Sea Dog", 1.25)));
    }

    @Test
    public void addItemToOrderTest() {
        order.addItem("Krabby Patty", 1.25);
        order.addItem("Salty Sea Dog", 1.25);
        assertArrayEquals(items, order.itemList());
    }
}
