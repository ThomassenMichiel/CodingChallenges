package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Pre4Test {
    @Test
    void first() {
        assertThat(new Pre4().pre4(ArrayHelper.array(1, 2, 4, 1))).isEqualTo(ArrayHelper.array(1,2));
    }

    @Test
    void second() {
        assertThat(new Pre4().pre4(ArrayHelper.array(3, 1, 4))).isEqualTo(ArrayHelper.array(3,1));
    }

    @Test
    void third() {
        assertThat(new Pre4().pre4(ArrayHelper.array(1, 4, 4))).isEqualTo(ArrayHelper.array(1));
    }
}
