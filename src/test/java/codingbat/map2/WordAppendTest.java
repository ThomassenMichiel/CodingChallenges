package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class WordAppendTest {
    @Test
    void first() {
        assertThat(new WordAppend().wordAppend(new String[]{"a", "b", "a"})).isEqualTo("a");
    }

    @Test
    void second() {
        assertThat(new WordAppend().wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"})).isEqualTo("aa");
    }

    @Test
    void third() {
        assertThat(new WordAppend().wordAppend(new String[]{"a", "", "a"})).isEqualTo("a");
    }
}
