package codewars.kyu7;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class HighestAndLowest {
  public static void main(String[] args) {
    System.out.println(highAndLow("42 -9"));
  }
  public static String highAndLow(String numbers) {
    IntSummaryStatistics intSummaryStatistics = Stream.of(numbers.split(" "))
            .mapToInt(Integer::valueOf)
            .summaryStatistics();
    return intSummaryStatistics.getMax() + " " + intSummaryStatistics.getMin();
  }
}