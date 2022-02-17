package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;

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

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public void updateTotal(Double total) {
        this.total = total;
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER ---  \n");
        items.stream().forEach(i -> System.out.println("\t" + i));
    }
}
