package codingbat.ap1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordsWithoutListTest {
    @Test
    void first() {
        assertThat(new WordsWithoutList().wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1)).isEqualTo(List.of("bb", "ccc"));
    }

    @Test
    void second() {
        assertThat(new WordsWithoutList().wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3)).isEqualTo(List.of("a", "bb", "b"));
    }

    @Test
    void third() {
        assertThat(new WordsWithoutList().wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4)).isEqualTo(List.of("a", "bb", "b", "ccc"));
    }
}
