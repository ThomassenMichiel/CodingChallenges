package codewars.kyu7.shadesofgrey;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreyTest {
    @Test
    public void test() {
        assertEquals("-1 should return an empty array", new String[0], ShadesOfGrey.shadesOfGrey(-1));
        assertEquals("0 should return an empty array", new String[0], ShadesOfGrey.shadesOfGrey(0));
        assertEquals("1 should return an array with #010101", new String[] {"#010101"}, ShadesOfGrey.shadesOfGrey(1));
    }
    
    @Test
    public void test2() {
        assertEquals(new String[]{"#010101"}, ShadesOfGrey.shadesOfGrey(254));
    }
}
