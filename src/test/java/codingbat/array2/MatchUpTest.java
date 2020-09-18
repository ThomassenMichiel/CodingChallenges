package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatchUpTest {
    @Test
    void first() {
        assertThat(new MatchUp().matchUp(ArrayHelper.array(1,2,3), ArrayHelper.array(2,3,10))).isEqualTo(2);
    }

    @Test
    void second() {
        assertThat(new MatchUp().matchUp(ArrayHelper.array(1,2,3), ArrayHelper.array(2,3,5))).isEqualTo(3);
    }

    @Test
    void third() {
        assertThat(new MatchUp().matchUp(ArrayHelper.array(1,2,3), ArrayHelper.array(2,3,3))).isEqualTo(2);
    }
}