package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCleanTest {
    
    private StringClean stringClean;
    
    @BeforeEach
    void setUp() {
        stringClean = new StringClean();
    }
    
    @Test
    void first() {
        assertThat(stringClean.stringClean("yyzzza")).isEqualTo("yza");
    }
    
    @Test
    void second() {
        assertThat(stringClean.stringClean("abbbcdd")).isEqualTo("abcd");
    }
    
    @Test
    void third() {
        assertThat(stringClean.stringClean("Hello")).isEqualTo("Helo");
    }
}
