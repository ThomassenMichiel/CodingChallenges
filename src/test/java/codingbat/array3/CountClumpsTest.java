package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountClumpsTest {
    @Test
    void first() {
        assertThat(new CountClumps().countClumps(ArrayHelper.array(1, 2, 2, 3, 4, 4))).isEqualTo(2);
    }

    @Test
    void second() {
        assertThat(new CountClumps().countClumps(ArrayHelper.array(1, 1, 2, 1, 1))).isEqualTo(2);
    }

    @Test
    void third() {
        assertThat(new CountClumps().countClumps(ArrayHelper.array(1, 1, 1, 1, 1))).isEqualTo(1);
    }
}
