package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lucky13Test {
    @Test
    void first() {
        assertThat(new Lucky13().lucky13(ArrayHelper.array(0, 2, 4))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Lucky13().lucky13(ArrayHelper.array(1, 2, 3))).isFalse();
    }

    @Test
    void third() {
        assertThat(new Lucky13().lucky13(ArrayHelper.array(1, 2, 4))).isFalse();
    }
}