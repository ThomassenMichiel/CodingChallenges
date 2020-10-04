package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordsCountTest {
    @Test
    void first() {
        assertThat(new WordsCount().wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1)).isEqualTo(2);
    }

    @Test
    void second() {
        assertThat(new WordsCount().wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3)).isEqualTo(1);
    }

    @Test
    void third() {
        assertThat(new WordsCount().wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4)).isEqualTo(0);
    }
}
