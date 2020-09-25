package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Sum67Test {

    @Test
    void first() {
        assertThat(new Sum67().sum67(ArrayHelper.array(1, 2, 2))).isEqualTo(5);
    }

    @Test
    void second() {
        assertThat(new Sum67().sum67(ArrayHelper.array(1, 2, 2, 6, 99, 99, 7))).isEqualTo(5);
    }

    @Test
    void third() {
        assertThat(new Sum67().sum67(ArrayHelper.array(1, 1, 6, 7, 2))).isEqualTo(4);
    }
}