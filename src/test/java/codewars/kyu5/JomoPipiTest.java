package codewars.kyu5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JomoPipiTest {
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
    @Timeout(1)
    public void fixedLargeTests() {
        String s = "codingisfornerdsyounerd";
        assertEquals("a", JomoPipi.jumbledString(s,11));
    }
}
