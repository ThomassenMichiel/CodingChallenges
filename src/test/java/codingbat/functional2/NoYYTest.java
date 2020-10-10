package codingbat.functional2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoYYTest {
    @Test
    void first() {
        assertThat(new NoYY().noYY(new ArrayList<>(List.of("a", "b", "c")))).isEqualTo(List.of("ay", "by", "cy"));
    }

    @Test
    void second() {
        assertThat(new NoYY().noYY(new ArrayList<>(List.of("a", "b", "cy")))).isEqualTo(List.of("ay", "by"));
    }

    @Test
    void third() {
        assertThat(new NoYY().noYY(new ArrayList<>(List.of("xx", "ya", "zz")))).isEqualTo(List.of("xxy", "yay", "zzy"));
    }
}
