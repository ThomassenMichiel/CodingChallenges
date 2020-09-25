package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HaveThreeTest {
    @Test
    void first() {
        assertThat(new HaveThree().haveThree(ArrayHelper.array(3, 1, 3, 1, 3))).isTrue();
    }

    @Test
    void second() {
        assertThat(new HaveThree().haveThree(ArrayHelper.array(3, 1, 3, 3))).isFalse();
    }

    @Test
    void third() {
        assertThat(new HaveThree().haveThree(ArrayHelper.array(3, 4, 3, 3, 4))).isFalse();
    }
}