package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TenRunTest {
    @Test
    void first() {
        assertThat(new TenRun().tenRun(ArrayHelper.array(2, 10, 3, 4, 20, 5))).isEqualTo(ArrayHelper.array(2, 10, 10, 10, 20, 20));
    }

    @Test
    void second() {
        assertThat(new TenRun().tenRun(ArrayHelper.array(10, 1, 20, 2))).isEqualTo(ArrayHelper.array(10, 10, 20, 20));
    }

    @Test
    void third() {
        assertThat(new TenRun().tenRun(ArrayHelper.array(10, 1, 9, 20))).isEqualTo(ArrayHelper.array(10, 10, 10, 20));
    }
}
