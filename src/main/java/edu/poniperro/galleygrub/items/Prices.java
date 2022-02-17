package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    private static final Map<String, Double> products = new HashMap<String, Double>();

    public static void init_prices() {
        products.putAll(Map.of(
                "large", 0.5,
                "sauce", 0.5,
                "medium", 0.5,
                "cheese", 0.5));
    }

    public static void display() {
        products.entrySet().stream()
                .forEach(p -> System.out.println("\t" + p));
    }
}
