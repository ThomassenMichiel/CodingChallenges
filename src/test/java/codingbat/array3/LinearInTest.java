package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinearInTest {
    @Test
    void first() {
        assertThat(new LinearIn().linearIn(ArrayHelper.array(1, 2, 4, 6), ArrayHelper.array(2, 4))).isTrue();
    }

    @Test
    void second() {
        assertThat(new LinearIn().linearIn(ArrayHelper.array(1, 2, 4, 6), ArrayHelper.array(2,3,4))).isFalse();
    }

    @Test
    void third() {
        assertThat(new LinearIn().linearIn(ArrayHelper.array(1, 2, 4, 4, 6), ArrayHelper.array(2,4))).isTrue();
    }

    @Test
    void fourth() {
        assertThat(new LinearIn().linearIn(ArrayHelper.array(2, 2, 2, 2, 4), ArrayHelper.array(2, 4))).isTrue();
    }
}
