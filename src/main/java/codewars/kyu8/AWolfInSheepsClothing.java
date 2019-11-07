package codewars.kyu8;

public class AWolfInSheepsClothing {

  public static String warnTheSheep(String[] array) {
    String reply = "Pls go away and stop eating my sheep";
    for (int i = array.length - 1; i > 0; i--) {
      if (array[i].equals("wolf")) {
        break;
      } else if (array[i-1].equals("wolf")) {
        reply = "Oi! Sheep number " + (array.length - i) + "! You are about to be eaten by a wolf!";
        break;
      }
    }
    return reply;
  }

}
