package codewars.kyu8;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
  
  public static String rps(String p1, String p2) {
    Map<String, String> opposites = new HashMap<>();
    opposites.put("scissors","paper");
    opposites.put("paper","rock");
    opposites.put("rock","scissors");
    
    if (p1.equals(opposites.get(p2))) {
      return "Player 2 won!";
    } else if (p2.equals(opposites.get(p1))) {
      return "Player 1 won!";
    }
    return "Draw!";
  }
}
