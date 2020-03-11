package codingbat.string1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrCopiesTest {
    private StrCopies strCopies;
    
    @BeforeEach
    void setUp() {
        strCopies = new StrCopies();
    }
    
    @Test
    void first() {
        assertThat(strCopies.strCopies("catcowcat", "cat", 2)).isTrue();
    }
    
    @Test
    void second() {
        assertThat(strCopies.strCopies("catcowcat", "cow", 2)).isFalse();
    }
    
    @Test
    void third() {
        assertThat(strCopies.strCopies("catcowcat", "cat", 1)).isTrue();
    }
}
