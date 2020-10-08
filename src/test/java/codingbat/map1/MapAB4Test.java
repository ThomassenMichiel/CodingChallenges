package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapAB4Test {
    @Test
    void first() {
        assertThat(new MapAB4().mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake")))).isEqualTo(Map.of("a", "aaa", "b", "bb", "c", "aaa"));
    }

    @Test
    void second() {
        assertThat(new MapAB4().mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake")))).isEqualTo(Map.of("a", "aa", "b", "bbb", "c", "bbb"));
    }

    @Test
    void third() {
        assertThat(new MapAB4().mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb")))).isEqualTo(Map.of("a", "aa", "b", "bbb", "c", "bbb"));
    }
}
