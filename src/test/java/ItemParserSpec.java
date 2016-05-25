import io.bryantcason.ItemParser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bryantcason on 5/25/16.
 */
public class ItemParserSpec {

    ItemParser itemParser;

    @Before
    public void init() {
        itemParser = new ItemParser();
    }

    @Test
    public void addItemTest(){
        String testItem = "name:bread";
        String expectedItem = "bread";
        String actualItem = itemParser.addItem(testItem);
        assertEquals("Should add item to hashmap", expectedItem, actualItem);
    }

    @Test
    public void checkItemExistTest(){
        String testItem = "name:bread";
        itemParser.addItem(testItem);
        assertEquals("checks if item exists", itemParser.checkItemExist("bread"));
    }
}
