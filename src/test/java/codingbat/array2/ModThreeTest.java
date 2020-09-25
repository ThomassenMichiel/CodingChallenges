package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ModThreeTest {
    @Test
    void first() {
        assertThat(new ModThree().modThree(ArrayHelper.array(2, 1, 3, 5))).isTrue();
    }

    @Test
    void second() {
        assertThat(new ModThree().modThree(ArrayHelper.array(2, 1, 2, 5))).isFalse();
    }

    @Test
    void third() {
        assertThat(new ModThree().modThree(ArrayHelper.array(2, 4, 2, 5))).isTrue();
    }
}