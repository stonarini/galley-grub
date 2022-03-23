package edu.poniperro.galleygrub.extras;

public enum Extras {
    CHEESE(0.25),
    SAUCE(0.5),
    LARGE(0.5);

    private final Double price;

    private Extras(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }
}
