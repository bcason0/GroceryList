package io.bryantcason;

import java.util.HashMap;

/**
 * Created by bryantcason on 5/24/16.
 */
public class Item {
    private String name;
    private int totalNumberOfOccurrence = 0;
    HashMap<String, Integer> priceOccurrence;

    public Item(String name){
        this.name = name;
        priceOccurrence = new HashMap<>();
        totalNumberOfOccurrence = 0;
    }

    public void addPriceOccurrence(String price){
        priceOccurrence.put(price, new Integer(1));
        totalNumberOfOccurrence++;
    }

    public void addCounter(String price){
        priceOccurrence.put(price, new Integer(priceOccurrence.get(price).intValue()+1));
        totalNumberOfOccurrence++;
    }


    public int getNumberOfOccurrence(String price) {
        return priceOccurrence.get(price).intValue();
    }
}
