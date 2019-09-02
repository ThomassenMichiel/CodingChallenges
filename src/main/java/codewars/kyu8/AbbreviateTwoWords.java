package codewars.kyu8;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    return name.split(" ")[0].toUpperCase().charAt(0) + "." + name.split(" ")[1].toUpperCase().charAt(0);
  }
}