package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoXTest {
    @Test
    void first() {
        assertThat(new NoX().noX(new ArrayList<>(List.of("ax", "bb", "cx")))).isEqualTo(List.of("a", "bb", "c"));
    }

    @Test
    void second() {
        assertThat(new NoX().noX(new ArrayList<>(List.of("xxax", "xbxbx", "xxcx")))).isEqualTo(List.of("a", "bb", "c"));
    }

    @Test
    void third() {
        assertThat(new NoX().noX(new ArrayList<>(List.of("x")))).isEqualTo(List.of(""));
    }
}
