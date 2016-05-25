import io.bryantcason.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bryantcason on 5/24/16.
 */
public class ItemSpec {
    Item item;

    @Before
    public void init(){
        item = new Item("Milk");
        item.addPriceOccurrence("3.10");
    }

    @Test
    public void addPriceOccurrenceTest(){
        item.addPriceOccurrence("2.50");
        int expectedPriceOccurrence = 1;
        int actualPriceOccurrence = item.getNumberOfOccurrence("2.50");
        assertEquals("Number of price occurrence should be 1", expectedPriceOccurrence, actualPriceOccurrence);
    }

    @Test
    public void addCounterTest(){
        item.addPriceOccurrence("3.10");
        int expectedValue = 1;
        int actualValue = item.getNumberOfOccurrence("3.10");
        assertEquals("Should occur once", expectedValue, actualValue);
    }
}
