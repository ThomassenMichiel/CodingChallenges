package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapAB3Test {
    @Test
    void first() {
        assertThat(new MapAB3().mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake")))).isEqualTo(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
    }

    @Test
    void second() {
        assertThat(new MapAB3().mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake")))).isEqualTo(Map.of("a", "bbb", "b", "bbb", "c", "cake"));
    }

    @Test
    void third() {
        assertThat(new MapAB3().mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake")))).isEqualTo(Map.of("a", "aaa", "b", "bbb", "c", "cake"));
    }
}
