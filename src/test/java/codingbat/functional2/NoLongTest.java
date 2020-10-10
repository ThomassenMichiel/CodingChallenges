package codingbat.functional2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

public class NoLongTest {
    @Test
    void first() {
        assertThat(new NoLong().noLong(new ArrayList<>(List.of("this", "not", "too", "long")))).isEqualTo(List.of("not", "too"));
    }

    @Test
    void second() {
        assertThat(new NoLong().noLong(new ArrayList<>(List.of("a", "bbb", "cccc")))).isEqualTo(List.of("a", "bbb"));
    }

    @Test
    void third() {
        assertThat(new NoLong().noLong(new ArrayList<>(List.of("cccc", "cccc", "cccc")))).isEqualTo(emptyList());
    }
}
