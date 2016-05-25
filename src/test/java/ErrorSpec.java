import io.bryantcason.Error;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bryantcason on 5/25/16.
 */
public class ErrorSpec {
    Error error;

    @Before
    public void init() {
        error = new Error("No Item Found");
    }

    @Test
    public void formattedToStringTest(){
        String expectedString = "Errors\t\t\tseen: 1 times";
        String actualString = Error.formattedToString();
        assertEquals("Should print out errors", expectedString, actualString);
    }
}
