package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;
import edu.poniperro.galleygrub.items.Prices;

public class Order implements Comanda {
    private Double total = 0.0;
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
        this.total += total;
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER --- ");
        items.stream().forEach(i -> itemDisplay(i));
    }

    private void itemDisplay(Item i) {
        System.out.print("\t" + i);
        if (!i.isRegular()) {
            System.out.print(String.format(" + %.2f$", Prices.getPriceOf(i.extra())));
        }
        System.out.println();

    }
}
