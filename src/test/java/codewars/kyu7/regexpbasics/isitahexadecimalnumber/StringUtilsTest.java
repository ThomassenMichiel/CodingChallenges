package codewars.kyu7.regexpbasics.isitahexadecimalnumber;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StringUtilsTest {
    
    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isHexNumber(""));
        assertFalse(StringUtils.isHexNumber("0x"));
        assertTrue(StringUtils.isHexNumber("0"));
        assertTrue(StringUtils.isHexNumber("0xDEADBEEF"));
        assertTrue(StringUtils.isHexNumber("1337bAbe"));
    }
}
