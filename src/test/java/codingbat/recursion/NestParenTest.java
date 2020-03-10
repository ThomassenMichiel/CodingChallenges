package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NestParenTest {
    private NestParen nestParen;
    
    @BeforeEach
    void setUp() {
        nestParen = new NestParen();
    }
    
    @Test
    void first() {
        assertThat(nestParen.nestParen("(())")).isTrue();
    }
    
    @Test
    void second() {
        assertThat(nestParen.nestParen("((()))")).isTrue();
    }
    
    @Test
    void third() {
        assertThat(nestParen.nestParen("(((x))")).isFalse();
    }
}
