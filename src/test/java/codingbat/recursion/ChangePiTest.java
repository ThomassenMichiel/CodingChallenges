package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChangePiTest {
    private ChangePi changePi;
    
    @BeforeEach
    void setUp() {
        changePi = new ChangePi();
    }
    
    @Test
    void first() {
        String answer = changePi.changePi("xpix");
        assertThat(answer).isEqualTo("x3.14x");
    }
    
    @Test
    void second() {
        String answer = changePi.changePi("pipi");
        assertThat(answer).isEqualTo("3.143.14");
    }
    
    @Test
    void third() {
        String answer = changePi.changePi("pip");
        assertThat(answer).isEqualTo("3.14p");
    }
}
