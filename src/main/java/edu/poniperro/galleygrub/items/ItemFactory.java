package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static final Map<String, Item> itemMap = new HashMap<String, Item>();

    public static Item getItem(String name, Double price) {
        if (!itemMap.containsKey(name)) {
            itemMap.put(name, new Item(name, price));
        }
        return itemMap.get(name);
    }

    public static Item getItem(String name, Double price, String extra) {
        String key = name + " " + extra;
        if (!itemMap.containsKey(key)) {
            itemMap.put(key, new Item(name, price, extra));
        }
        return itemMap.get(key);
    }

    public static int size() {
        return itemMap.size();
    }

    public static void clear() {
        itemMap.clear();
    }
}
