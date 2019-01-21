package codewars.kyu6;

import java.util.stream.IntStream;

public class Solution {
  public static void main(String[] args) {
    System.out.println(solution(1000));
  }

  public static int solution(int number) {
    return IntStream.range(0,number)
            .filter(value -> value % 5 == 0 || value % 3 == 0)
            .sum();
  }
}