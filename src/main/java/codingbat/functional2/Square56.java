package codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(i -> i * i)
                .map(i -> i + 10)
                .filter(i -> i % 10 != 5)
                .filter(i -> i % 10 != 6)
                .collect(Collectors.toList());
    }
}
