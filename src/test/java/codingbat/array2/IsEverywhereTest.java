package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IsEverywhereTest {
    @Test
    void first() {
        assertThat(new IsEverywhere().isEverywhere(new int[]{1, 2, 1, 3}, 1)).isTrue();
    }

    @Test
    void second() {
        assertThat(new IsEverywhere().isEverywhere(new int[]{1, 2, 1, 3}, 2)).isFalse();
    }

    @Test
    void third() {
        assertThat(new IsEverywhere().isEverywhere(new int[]{1, 2, 1, 3, 4}, 1)).isFalse();
    }
}