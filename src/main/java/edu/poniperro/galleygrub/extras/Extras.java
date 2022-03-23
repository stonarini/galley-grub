package edu.poniperro.galleygrub.extras;

public enum Extras {
    CHEESE(0.25),
    SAUCE(0.5),
    LARGE(0.5);

    private final double price;

    private Extras(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String lowercaseName() {
        return this.name().toLowerCase();
    }
}
