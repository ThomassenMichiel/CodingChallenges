package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Post4Test {
    @Test
    void first() {
        assertThat(new Post4().post4(ArrayHelper.array(2, 4, 1, 2))).isEqualTo(ArrayHelper.array(1,2));
    }

    @Test
    void second() {
        assertThat(new Post4().post4(ArrayHelper.array(4, 1, 4, 2))).isEqualTo(ArrayHelper.array(2));
    }

    @Test
    void third() {
        assertThat(new Post4().post4(ArrayHelper.array(4, 4, 1, 2, 3))).isEqualTo(ArrayHelper.array(1, 2, 3));
    }
}
