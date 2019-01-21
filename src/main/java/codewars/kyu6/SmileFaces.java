package codewars.kyu6;

import java.util.*;

public class SmileFaces {

    public static void main(String[] args) {
        System.out.println(countSmileys(Arrays.asList(":)", ";(")));
    }
  
  public static int countSmileys(List<String> arr) {
      return (int) arr.stream().filter(s -> s.matches("([;:])([-~])?([)D])")).count();
  }
}