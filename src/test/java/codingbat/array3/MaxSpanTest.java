package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxSpanTest {

    @Test
    void first() {
        assertThat(new MaxSpan().maxSpan(ArrayHelper.array(1, 2, 1, 1, 3))).isEqualTo(4);
    }

    @Test
    void second() {
        assertThat(new MaxSpan().maxSpan(ArrayHelper.array(1, 4, 2, 1, 4, 1, 4))).isEqualTo(6);
    }

    @Test
    void third() {
        assertThat(new MaxSpan().maxSpan(ArrayHelper.array(1, 4, 2, 1, 4, 4, 4))).isEqualTo(6);
    }
}