package edu.poniperro.galleygrub.items;

public class Item implements Product {
    String name;
    Double price;
    String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this(name, price);
        this.extra = extra;
    }

}
