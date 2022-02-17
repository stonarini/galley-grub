package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;

public class Order implements Comanda {
    private Double total;
    private final List<Item> items = new ArrayList<Item>();

    public Order() {
    };

    @Override
    public void addItem(String name, Double price) {
        items.add(ItemFactory.getItem(name, price));
    }

    @Override
    public void addItem(String name, Double price, String extra) {
        items.add(ItemFactory.getItem(name, price, extra));
    }

    @Override
    public List<Item> itemList() {
        return this.items;
    }
}
