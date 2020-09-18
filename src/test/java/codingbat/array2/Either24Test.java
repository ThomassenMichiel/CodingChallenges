package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Either24Test {
    @Test
    void first() {
        assertThat(new Either24().either24(ArrayHelper.array(1, 2, 2))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Either24().either24(ArrayHelper.array(4, 4, 1))).isTrue();
    }

    @Test
    void third() {
        assertThat(new Either24().either24(ArrayHelper.array(4, 4, 1, 2, 2))).isFalse();
    }
}