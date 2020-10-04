package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordsFrontTest {
    @Test
    void first() {
        assertThat(new WordsFront().wordsFront(new String[]{"a", "b", "c", "d"}, 1)).isEqualTo(new String[]{"a"});
    }

    @Test
    void second() {
        assertThat(new WordsFront().wordsFront(new String[]{"a", "b", "c", "d"}, 2)).isEqualTo(new String[]{"a", "b"});
    }

    @Test
    void third() {
        assertThat(new WordsFront().wordsFront(new String[]{"a", "b", "c", "d"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
    }
}
