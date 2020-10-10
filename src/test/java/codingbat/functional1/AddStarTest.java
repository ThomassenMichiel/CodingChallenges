package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AddStarTest {
    @Test
    void first() {
        assertThat(new AddStar().addStar(new ArrayList<>(List.of("a", "bb", "ccc")))).isEqualTo(List.of("a*", "bb*", "ccc*"));
    }

    @Test
    void second() {
        assertThat(new AddStar().addStar(new ArrayList<>(List.of("hello", "there")))).isEqualTo(List.of("hello*", "there*"));
    }

    @Test
    void third() {
        assertThat(new AddStar().addStar(new ArrayList<>(List.of("*")))).isEqualTo(List.of("**"));
    }
}
