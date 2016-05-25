package io.bryantcason;

import java.util.HashMap;

/**
 * Created by bryantcason on 5/25/16.
 */
public class ItemParser {

    HashMap<String, Item> groceryList;

    public void engine(String input){

    }
    private void printErrors(){
        System.out.println(Error.formattedToString());
    }

    private void printGroceryList(){
        for(HashMap.Entry<String, Item> entry : groceryList.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public String addItem(String currentItem){
        String itemName;
        try{
            itemName = StringUtils.grabValue(currentItem);
        }catch(Error e){
            itemName = null;
        }
        if(itemName!=null){
            itemName = StringUtils.normalizeWord(itemName);
            itemName = StringUtils.spellingCorrector(itemName);
        }

        return itemName;
    }

    public boolean checkItemExist(String itemName){
        return groceryList.containsKey(itemName);
    }
}

