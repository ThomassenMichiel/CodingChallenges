package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapAB2Test {
    @Test
    void first() {
        assertThat(new MapAB2().mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake")))).isEqualTo(Map.of("c", "cake"));
    }

    @Test
    void second() {
        assertThat(new MapAB2().mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb")))).isEqualTo(Map.of("a", "aaa", "b", "bbb"));
    }

    @Test
    void third() {
        assertThat(new MapAB2().mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa")))).isEqualTo(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
    }
}
