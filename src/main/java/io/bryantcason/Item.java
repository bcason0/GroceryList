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

    public boolean checkPriceExist(String price){
        return priceOccurrence.containsKey(price);
    }

    public String formattedToString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name:\t"+name).append("\t\tseen: "+totalNumberOfOccurrence+"times\n")
                .append("=============\t\t=============\n");
        for(HashMap.Entry<String, Integer> entry: priceOccurrence.entrySet()){
            stringBuilder.append("Price:\t"+entry.getKey()).append("\t\tseen: "+entry.getValue().intValue()+" times\n")
                    .append("-------------\t\t-------------\n");
        }
        return stringBuilder.toString();
    }
}
