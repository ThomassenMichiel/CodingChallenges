package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class No14Test {
    @Test
    void first() {
        assertThat(new No14().no14(new int[]{1, 2, 3})).isTrue();
    }

    @Test
    void second() {
        assertThat(new No14().no14(new int[]{1, 2, 3, 4})).isFalse();
    }

    @Test
    void third() {
        assertThat(new No14().no14(new int[]{2, 3, 4})).isTrue();
    }
}