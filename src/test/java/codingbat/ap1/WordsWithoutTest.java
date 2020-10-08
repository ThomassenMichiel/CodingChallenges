package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordsWithoutTest {
    @Test
    void first() {
        assertThat(new WordsWithout().wordsWithout(new String[]{"a", "b", "c", "a"}, "a")).isEqualTo(new String[]{"b", "c"});
    }

    @Test
    void second() {
        assertThat(new WordsWithout().wordsWithout(new String[]{"a", "b", "c", "a"}, "b")).isEqualTo(new String[]{"a", "c", "a"});
    }

    @Test
    void third() {
        assertThat(new WordsWithout().wordsWithout(new String[]{"a", "b", "c", "a"}, "c")).isEqualTo(new String[]{"a", "b", "a"});
    }
}
