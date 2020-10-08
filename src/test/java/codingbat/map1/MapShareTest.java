package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapShareTest {
    @Test
    void first() {
        assertThat(new MapShare().mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc")))).isEqualTo(Map.of("a", "aaa", "b", "aaa"));
    }

    @Test
    void second() {
        assertThat(new MapShare().mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc")))).isEqualTo(Map.of("b", "xyz"));
    }

    @Test
    void third() {
        assertThat(new MapShare().mapShare(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi")))).isEqualTo(Map.of("a", "aaa", "b", "aaa", "d", "hi"));
    }
}
