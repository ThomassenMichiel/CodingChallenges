package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class FirstCharTest {
    @Test
    void first() {
        assertThat(new FirstChar().firstChar(new String[]{"salt", "tea", "soda", "toast"})).isEqualTo(Map.of("s", "saltsoda", "t", "teatoast"));
    }

    @Test
    void second() {
        assertThat(new FirstChar().firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"})).isEqualTo(Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d"));
    }

    @Test
    void third() {
        assertThat(new FirstChar().firstChar(new String[0])).isEqualTo(Collections.emptyMap());
    }
}
