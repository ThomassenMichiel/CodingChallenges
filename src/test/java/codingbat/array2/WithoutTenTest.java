package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WithoutTenTest {
    @Test
    void first() {
        assertThat(new WithoutTen().withoutTen(ArrayHelper.array(1, 10, 10, 2))).isEqualTo(new int[]{1, 2, 0, 0});
    }

    @Test
    void second() {
        assertThat(new WithoutTen().withoutTen(ArrayHelper.array(10, 2, 10))).isEqualTo(new int[]{2, 0, 0});
    }

    @Test
    void third() {
        assertThat(new WithoutTen().withoutTen(ArrayHelper.array(1, 99, 10))).isEqualTo(new int[]{1, 99, 0});
    }
}
