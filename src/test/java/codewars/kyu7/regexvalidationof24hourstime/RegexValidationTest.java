package codewars.kyu7.regexvalidationof24hourstime;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegexValidationTest {
    
    @Test
    public void test1() {
        assertTrue(RegexValidation.validateTime("01:00"));
    }
    
    @Test
    public void test2() {
        assertTrue(RegexValidation.validateTime("1:00"));
    }
    
    @Test
    public void test3() {
        assertTrue(RegexValidation.validateTime("00:00"));
    }
    
    @Test
    public void test4() {
        assertFalse(RegexValidation.validateTime("13:1"));
    }
    
    @Test
    public void test5() {
        assertFalse(RegexValidation.validateTime("12:60"));
    }
    
    @Test
    public void test6() {
        assertTrue(RegexValidation.validateTime("15:00"));
    }
    
    @Test
    public void test7() {
        assertTrue(RegexValidation.validateTime("22:59"));
    }
    
    @Test
    public void test8() {
        assertTrue(RegexValidation.validateTime("2:59"));
    }
}
