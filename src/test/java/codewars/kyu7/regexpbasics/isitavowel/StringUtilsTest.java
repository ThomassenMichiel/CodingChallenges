package codewars.kyu7.regexpbasics.isitavowel;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
    
    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isVowel(""));
        assertTrue(StringUtils.isVowel("a"));
        assertTrue(StringUtils.isVowel("E"));
        assertFalse(StringUtils.isVowel("ou"));
        assertFalse(StringUtils.isVowel("z"));
        assertFalse(StringUtils.isVowel("lol"));
    }
}
