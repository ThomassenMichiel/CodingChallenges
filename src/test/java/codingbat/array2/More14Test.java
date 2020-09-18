package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class More14Test {

    @Test
    void first() {
        assertThat(new More14().more14(new int[]{1, 4, 1})).isTrue();
    }

    @Test
    void second() {
        assertThat(new More14().more14(new int[]{1, 4, 1, 4})).isFalse();
    }

    @Test
    void third() {
        assertThat(new More14().more14(new int[]{1, 1})).isTrue();
    }
}