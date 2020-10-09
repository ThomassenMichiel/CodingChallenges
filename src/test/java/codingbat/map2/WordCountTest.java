package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class WordCountTest {
    @Test
    void first() {
        assertThat(new WordCount().wordCount(new String[]{"a", "b", "a", "c", "b"})).isEqualTo(Map.of("a", 2, "b", 2, "c", 1));
    }

    @Test
    void second() {
        assertThat(new WordCount().wordCount(new String[]{"c", "b", "a"})).isEqualTo(Map.of("a", 1, "b", 1, "c", 1));
    }

    @Test
    void third() {
        assertThat(new WordCount().wordCount(new String[]{"c", "c", "c", "c"})).isEqualTo(Map.of("c", 4));
    }
}
