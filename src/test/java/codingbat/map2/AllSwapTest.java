package codingbat.map2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AllSwapTest {
    @Test
    void first() {
        assertThat(new AllSwap().allSwap(new String[]{"ab", "ac"})).isEqualTo(new String[]{"ac", "ab"});
    }

    @Test
    void second() {
        assertThat(new AllSwap().allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})).isEqualTo(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"});
    }

    @Test
    void third() {
        assertThat(new AllSwap().allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})).isEqualTo(new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"});
    }
}
