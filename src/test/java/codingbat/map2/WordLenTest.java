package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class WordLenTest {
    @Test
    void first() {
        assertThat(new WordLen().wordLen(new String[]{"a", "bb", "a", "bb"})).isEqualTo(Map.of("bb", 2, "a", 1));
    }

    @Test
    void second() {
        assertThat(new WordLen().wordLen(new String[]{"this", "and", "that", "and"})).isEqualTo(Map.of("that", 4, "and", 3, "this", 4));
    }

    @Test
    void third() {
        assertThat(new WordLen().wordLen(new String[]{"code", "code", "code", "bug"})).isEqualTo(Map.of("code", 4, "bug", 3));
    }
}
