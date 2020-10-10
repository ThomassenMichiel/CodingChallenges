package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Copies3Test {
    @Test
    void first() {
        assertThat(new Copies3().copies3(new ArrayList<>(List.of("a", "bb", "ccc")))).isEqualTo(List.of("aaa", "bbbbbb", "ccccccccc"));
    }

    @Test
    void second() {
        assertThat(new Copies3().copies3(new ArrayList<>(List.of("24", "a", "")))).isEqualTo(List.of("242424", "aaa", ""));
    }

    @Test
    void third() {
        assertThat(new Copies3().copies3(new ArrayList<>(List.of("hello", "there")))).isEqualTo(List.of("hellohellohello", "theretherethere"));
    }
}
