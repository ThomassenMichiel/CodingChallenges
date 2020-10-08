package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Word0Test {
    @Test
    void first() {
        assertThat(new Word0().word0(new String[]{"a", "b", "a", "b"})).isEqualTo(Map.of("a", 0, "b", 0));
    }

    @Test
    void second() {
        assertThat(new Word0().word0(new String[]{"a", "b", "a", "c", "b"})).isEqualTo(Map.of("a", 0, "b", 0, "c", 0));
    }

    @Test
    void third() {
        assertThat(new Word0().word0(new String[]{"c", "b", "a"})).isEqualTo(Map.of("a", 0, "b", 0, "c", 0));
    }
}
