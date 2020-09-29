package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ZeroMaxTest {
    @Test
    void first() {
        assertThat(new ZeroMax().zeroMax(ArrayHelper.array(0, 5, 0, 3))).isEqualTo(new int[]{5, 5, 3, 3});
    }

    @Test
    void second() {
        assertThat(new ZeroMax().zeroMax(ArrayHelper.array(0, 4, 0, 3))).isEqualTo(new int[]{3, 4, 3, 3});
    }

    @Test
    void third() {
        assertThat(new ZeroMax().zeroMax(ArrayHelper.array(0, 1, 0))).isEqualTo(new int[]{1, 1, 0});
    }
}
