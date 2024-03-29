package codewars.kyu5.piglatin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
    
    @Test
    public void extraTests() {
        assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
    }
}
