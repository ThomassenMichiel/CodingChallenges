package codewars.kyu6.characterwithlongestconsecutiverepetition;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD by writing your own tests

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, Solution.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, Solution.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, Solution.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, Solution.longestRepetition(""));
    }
    
    @Test
    public void firstTest() {
        assertArrayEquals(new Object[]{"l", 2}, Solution.longestRepetition("0f90tnjr2cz5er7sgfvkmjke1c3l0cd4yji6dbs5thvfbadx3qsrenjpa2014i3hkd90on2z1fodz9chc7z6l5uo9z7h505rbie0w6halb6zcl28fcz0qz4aezp6dzcw8w0roupn0d4llkys12ely"));
        assertArrayEquals(new Object[]{"w", 2}, Solution.longestRepetition("id0km3ww9z85sx58ershy7l4wh2ch2q93xqhno1u6raeq087fcaqe3ocwrh7l7lxh55tzch2wwj3s8r1zbmbyaw13047906lhugi7wyvngicvr7dyjw70wcmkai7xr9r52atxwgfcog4mjox8cuf7paw9y7wg18t85x50mq8meffhggat8li8l95mc2fpluasnm20c7q97ho15gxygo3zjikoscjkhmmsq6jzqwcra14fg5dhz8wulpl6xmlyicvgq2jcnwmc3oxaspsnoptbfvw7596eumybxbq44olvo31n6cp2tfbwpjfwhtsj341yq3lih4miz9o9xv1qps6445lgf1q6an1tw9li1h61gyv7gp6pqc9yfsxedvgbcmk56buylm21zcal7srkgiret1yz1r"));
    }
}
