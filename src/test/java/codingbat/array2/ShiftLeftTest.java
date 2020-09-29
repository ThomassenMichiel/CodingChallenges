package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShiftLeftTest {
    @Test
    void first() {
        assertThat(new ShiftLeft().shiftLeft(ArrayHelper.array(6, 2, 5, 3))).isEqualTo(ArrayHelper.array(2, 5, 3, 6));
    }

    @Test
    void second() {
        assertThat(new ShiftLeft().shiftLeft(ArrayHelper.array(1, 2))).isEqualTo(ArrayHelper.array(2, 1));
    }

    @Test
    void third() {
        assertThat(new ShiftLeft().shiftLeft(ArrayHelper.array(1))).isEqualTo(ArrayHelper.array(1));
    }
}
