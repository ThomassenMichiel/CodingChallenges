package codewars.kyu5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
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
    
    @Test
    public void fixed4() {
        String s = "this_test_will_hurt_you", a = "ti_etwl_utyuhsts_ilhr_o";
        assertEquals(a,JomoPipi.jumbledString(s,12345678987654321L));
    }
    
    @Test
    public void fixed5() {
        String s = "this_test_will_hurt_you", a = "ti_etwl_utyuhsts_ilhr_o";
        assertEquals(a,JomoPipi.jumbledString(s,12345678987654321L));
    }
}