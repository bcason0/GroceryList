import io.bryantcason.*;
import io.bryantcason.Error;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsSpec {
    @Test
    public void parseInToStringArrayTest(){
        String test = "milk##bread##cookies##";
        String[] expectedArray = {"milk", "bread", "cookies"};
        String[] actualArray = StringUtils.parseInToStringArray(test);
        assertArrayEquals("Should get rid of the # symbol", expectedArray, actualArray);
    }

    @Test
    public void splitStringIntoKeyValuePairsTest(){
        String test = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";
        String[] expectedArray = {"naMe:Milk", "price:3.23","type:Food", "expiration:1/25/2016"};
        String[] actualArray = StringUtils.splitStringIntoKeyValuePairs(test);
        assertArrayEquals("Should split into key:value pairs", expectedArray, actualArray);
    }

    @Test
    public void grabKeyTest(){
        String test = "naMe:Milk";
        String expectedKey = "naMe";
        String actualKey = StringUtils.grabKey(test);
        assertEquals("Should return key", expectedKey, actualKey);
    }

    @Test
    public void grabValueTest() throws Error{
        String test = "naMe:Milk";
        String expectedValue = "Milk";
        String actualValue = StringUtils.grabValue(test);
        assertEquals("Should return the value", expectedValue, actualValue);
    }

    @Test
    public void spellingCorrectorTest(){
        String test = "c00kies";
        String expectedWord = "cookies";
        String actualWord = StringUtils.spellingCorrector(test);
        assertEquals("Should replace 0 with o", expectedWord, actualWord);
    }

    @Test
    public void normalizeWordTest(){
        String test = "naMe";
        String expectedWord = "name";
        String actualWord = StringUtils.normalizeWord(test);
        assertEquals("Should name all letters", expectedWord, actualWord);
    }
}
