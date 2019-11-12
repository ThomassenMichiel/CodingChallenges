package codewars.kyu5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CenturyFromYearTest {
    
    @Test
    public void fixed_large_tests() {
        String s = "I like it!", a = "Iiei t kl!";
        assertEquals(a, JomoPipi.jumbledString(s,1234));
    }
    
    @Test
    public void fixed1() {
        String s = "Such Wow!", a = "Sc o!uhWw";
        assertEquals(a, JomoPipi.jumbledString(s,1));
    }
    
    @Test
    public void fixed2() {
        String s = "better example", a = "bexltept merae";
        assertEquals(a, JomoPipi.jumbledString(s,2));
    }
    
    @Test
    public void fixed3() {
        String s = "Greetings", a = "Gtsegenri";
        assertEquals(a, JomoPipi.jumbledString(s,8));
    }
}
