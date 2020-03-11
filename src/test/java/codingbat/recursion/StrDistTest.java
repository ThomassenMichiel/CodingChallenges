package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrDistTest {
    private StrDist strDist;
    
    @BeforeEach
    void setUp() {
        strDist = new StrDist();
    }
    
    @Test
    void first() {
        assertThat(strDist.strDist("catcowcat","cat")).isEqualTo(9);
    }
    
    @Test
    void second() {
        assertThat(strDist.strDist("catcowcat","cow")).isEqualTo(3);
    }
    
    @Test
    void third() {
        assertThat(strDist.strDist("cccatcowcatxx","cat")).isEqualTo(9);
    }
}
