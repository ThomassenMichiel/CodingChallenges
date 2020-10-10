package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class WordMultipleTest {
    @Test
    void first() {
        assertThat(new WordMultiple().wordMultiple(new String[]{"a", "b", "a", "c", "b"})).isEqualTo(Map.of("a", true, "b", true, "c", false));
    }

    @Test
    void second() {
        assertThat(new WordMultiple().wordMultiple(new String[]{"c", "b", "a"})).isEqualTo(Map.of("a", false, "b", false, "c", false));
    }

    @Test
    void third() {
        assertThat(new WordMultiple().wordMultiple(new String[]{"c", "c", "c", "c"})).isEqualTo(Map.of("c", true));
    }
}
