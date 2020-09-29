package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoTwoTest {
    @Test
    void first() {
        assertThat(new TwoTwo().twoTwo(ArrayHelper.array(4, 2, 2, 3))).isTrue();
    }

    @Test
    void second() {
        assertThat(new TwoTwo().twoTwo(ArrayHelper.array(2, 2, 4))).isTrue();
    }

    @Test
    void third() {
        assertThat(new TwoTwo().twoTwo(ArrayHelper.array(2, 2, 4, 2))).isFalse();
    }
}
