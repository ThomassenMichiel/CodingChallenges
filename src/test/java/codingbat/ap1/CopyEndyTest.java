package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CopyEndyTest {
    @Test
    void first() {
        assertThat(new CopyEndy().copyEndy(ArrayHelper.array(9, 11, 90, 22, 6), 2)).isEqualTo(ArrayHelper.array(9, 90));
    }

    @Test
    void second() {
        assertThat(new CopyEndy().copyEndy(ArrayHelper.array(9, 11, 90, 22, 6), 3)).isEqualTo(ArrayHelper.array(9, 90, 6));
    }

    @Test
    void third() {
        assertThat(new CopyEndy().copyEndy(ArrayHelper.array(12, 1, 1, 13, 0, 20), 2)).isEqualTo(ArrayHelper.array(1, 1));
    }
}
