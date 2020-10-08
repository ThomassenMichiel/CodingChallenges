package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoresSpecialTest {
    @Test
    void first() {
        assertThat(new ScoresSpecial().scoresSpecial(ArrayHelper.array(12, 10, 4), ArrayHelper.array(2, 20, 30))).isEqualTo(40);
    }


    @Test
    void second() {
        assertThat(new ScoresSpecial().scoresSpecial(ArrayHelper.array(20, 10, 4), ArrayHelper.array(2, 20, 10))).isEqualTo(40);
    }

    @Test
    void third() {
        assertThat(new ScoresSpecial().scoresSpecial(ArrayHelper.array(12, 11, 4), ArrayHelper.array(2, 20, 31))).isEqualTo(20);
    }
}
