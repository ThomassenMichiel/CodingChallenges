package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ZeroFrontTest {
    @Test
    void first() {
        assertThat(new ZeroFront().zeroFront(ArrayHelper.array(1,0,0,1))).isEqualTo(new int[]{0,0,1,1});
    }

    @Test
    void second() {
        assertThat(new ZeroFront().zeroFront(ArrayHelper.array(0,1,1,0,1))).isEqualTo(new int[]{0,0,1,1,1});
    }

    @Test
    void third() {
        assertThat(new ZeroFront().zeroFront(ArrayHelper.array(1,0))).isEqualTo(new int[]{0,1});
    }
}
