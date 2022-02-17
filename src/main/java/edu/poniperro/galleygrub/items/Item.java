package edu.poniperro.galleygrub.items;

public class Item implements Product {
    String name;
    Double price;
    String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
        Prices.init_prices();
    }

    public Item(String name, Double price, String extra) {
        this(name, price);
        this.extra = extra;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return extra() == null ? true : false;
    }

    @Override
    public String toString() {
        if (isRegular()) {
            return String.format("%s....%.2f$", name(), price());
        } else {
            return String.format("%s w/ %s....%.2f$", name(), extra(), price());
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Item ? this.name.equals(((Item) obj).name()) : false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
