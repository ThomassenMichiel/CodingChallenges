package codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(i -> i * 2)
                .filter(i -> i % 10 != 2)
                .collect(Collectors.toList());
    }
}
