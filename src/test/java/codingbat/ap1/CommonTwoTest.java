package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommonTwoTest {
    @Test
    void first() {
        assertThat(new CommonTwo().commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"})).isEqualTo(2);
    }


    @Test
    void second() {
        assertThat(new CommonTwo().commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"})).isEqualTo(3);
    }

    @Test
    void third() {
        assertThat(new CommonTwo().commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"})).isEqualTo(3);
    }
}
