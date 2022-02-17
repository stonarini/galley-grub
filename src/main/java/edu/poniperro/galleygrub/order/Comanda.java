package edu.poniperro.galleygrub.order;

public interface Comanda {
    void addItem(String name, Double price);

    void addItem(String name, Double price, String extra);

    void display();
}
