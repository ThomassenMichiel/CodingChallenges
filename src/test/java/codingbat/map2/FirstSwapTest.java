package codingbat.map2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstSwapTest {
    @Test
    void first() {
        assertThat(new FirstSwap().firstSwap(new String[]{"ab", "ac"})).isEqualTo(new String[]{"ac", "ab"});
    }

    @Test
    void second() {
        assertThat(new FirstSwap().firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})).isEqualTo(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"});
    }

    @Test
    void third() {
        assertThat(new FirstSwap().firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})).isEqualTo(new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"});
    }
}
