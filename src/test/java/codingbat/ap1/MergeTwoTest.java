package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoTest {
    @Test
    void first() {
        assertThat(new MergeTwo().mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
    }


    @Test
    void second() {
        assertThat(new MergeTwo().mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)).isEqualTo(new String[]{"a", "c", "f"});
    }

    @Test
    void third() {
        assertThat(new MergeTwo().mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3)).isEqualTo(new String[]{"c", "f", "g"});
    }
}
