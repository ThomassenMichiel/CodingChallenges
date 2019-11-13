package codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HQ {
  public static void main(String[] args) {
    System.out.println(HQ9('9'));
  }
  public static String HQ9(char code) {
    switch (code) {
      case 'H': return "Hello World!";
      case 'Q': return String.valueOf(code);
      case '9': return IntStream.iterate(99,i -> i - 1)
              .limit(100)
              .mapToObj(HQ::bottlesOnTheWall)
              .collect(Collectors.joining());
    }
    return null;
  }
  
  private static String bottlesOnTheWall(int i) {
    if (i == 0) {
      return "No more bottles of beer on the wall, no more bottles of beer.\n" +
              "Go to the store and buy some more, 99 bottles of beer on the wall.";
    } else if (i == 1) {
      return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
              "Take one down and pass it around, no more bottles of beer on the wall.\n";
    } else if (i == 2) {
      return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
              "Take one down and pass it around, 1 bottle of beer on the wall.\n";
    } else {
      return String.format("%d bottles of beer on the wall, %d bottles of beer.\n" +
              "Take one down and pass it around, %d bottles of beer on the wall.\n",i,i,i-1);
    }
  }
}
