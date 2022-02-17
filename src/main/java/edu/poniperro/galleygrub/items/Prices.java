package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    private static final Map<String, Double> products = new HashMap<String, Double>();

    public static void init_prices() {
        products.putAll(Map.of(
                "large", 0.5,
                "sauce", 0.5,
                "medium", 0.25,
                "cheese", 0.25));
    }

    public static double getPriceOf(String name) {
        return products.get(name);
    }

    public static void display() {
        products.entrySet().stream()
                .forEach(p -> System.out.println("\t" + p));
    }
}
