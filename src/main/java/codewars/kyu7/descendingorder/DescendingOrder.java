package codewars.kyu7.descendingorder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num == 0) {
            return 0;
        }
        List<Integer> sort = new ArrayList<>();
        int operationalNumber = num;
        for (int i = 0; i < operationalNumber; operationalNumber /= 10) {
            sort.add(operationalNumber % 10);
        }
        sort.sort(Comparator.reverseOrder());
        return Integer.parseInt(sort.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
