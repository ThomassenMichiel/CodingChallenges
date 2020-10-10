package codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i > 19 || i < 13)
                .collect(Collectors.toList());
    }
}
