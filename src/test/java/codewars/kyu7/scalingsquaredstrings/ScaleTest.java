package codewars.kyu7.scalingsquaredstrings;

import static org.junit.Assert.*;
import org.junit.Test;

public class ScaleTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests scale");
        String a ="abcd\nefgh\nijkl\nmnop";
        String r = "aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\n"
                + "iijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp";
        testing(Scale.scale(a, 2, 3), r);
        testing(Scale.scale("", 5, 5), "");
        testing(Scale.scale("Kj\nSH", 1, 2),"Kj\nKj\nSH\nSH");
    }

    @Test
    public void horizontal() {
        String given = "abcd";
        String expected = "aabbccdd";
        testing(Scale.scale(given, 2, 1), expected);
    }
}