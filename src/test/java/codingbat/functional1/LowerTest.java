package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LowerTest {
    @Test
    void first() {
        assertThat(new Lower().lower(new ArrayList<>(List.of("Hello", "Hi")))).isEqualTo(List.of("hello", "hi"));
    }

    @Test
    void second() {
        assertThat(new Lower().lower(new ArrayList<>(List.of("AAA", "BBB", "ccc")))).isEqualTo(List.of("aaa", "bbb", "ccc"));
    }

    @Test
    void third() {
        assertThat(new Lower().lower(new ArrayList<>(List.of("KitteN", "ChocolaTE")))).isEqualTo(List.of("kitten", "chocolate"));
    }
}
