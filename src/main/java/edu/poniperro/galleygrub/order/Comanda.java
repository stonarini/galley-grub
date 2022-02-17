package edu.poniperro.galleygrub.order;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;

public interface Comanda {
    void addItem(String name, Double price);

    void addItem(String name, Double price, String extra);

    List<Item> itemList();

    void display();
}
