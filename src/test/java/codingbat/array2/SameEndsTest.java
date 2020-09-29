package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameEndsTest {
    @Test
    void first() {
        assertThat(new SameEnds().sameEnds(ArrayHelper.array(5, 6, 45, 99, 13, 5, 6), 1)).isFalse();
    }

    @Test
    void second() {
        assertThat(new SameEnds().sameEnds(ArrayHelper.array(5, 6, 45, 99, 13, 5, 6), 2)).isTrue();
    }

    @Test
    void third() {
        assertThat(new SameEnds().sameEnds(ArrayHelper.array(5, 6, 45, 99, 13, 5, 6), 3)).isFalse();
    }
}
