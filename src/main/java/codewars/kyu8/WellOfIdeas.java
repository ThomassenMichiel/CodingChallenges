package codewars.kyu8;

import java.util.Arrays;

public class WellOfIdeas {

  public static String well(String[] x) {
    long goodIdeas = Arrays.stream(x).filter(s -> s.equals("good")).count();
    return goodIdeas == 0 ? "Fail!" : goodIdeas <= 2 ? "Publish!" : "I smell a series!";
  }

}
