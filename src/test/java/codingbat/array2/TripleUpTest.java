package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TripleUpTest {
    @Test
    void first() {
        assertThat(new TripleUp().tripleUp(ArrayHelper.array(1, 4, 5, 6, 2))).isTrue();
    }

    @Test
    void second() {
        assertThat(new TripleUp().tripleUp(ArrayHelper.array(1, 2, 3))).isTrue();
    }

    @Test
    void third() {
        assertThat(new TripleUp().tripleUp(ArrayHelper.array(1, 2, 4))).isFalse();
    }
}
