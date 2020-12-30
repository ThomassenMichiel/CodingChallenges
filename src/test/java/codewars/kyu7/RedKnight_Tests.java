package codewars.kyu7;

import codewars.kyu7.pawndistance.CodeWars;
import codewars.kyu7.pawndistance.PawnDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedKnight_Tests {
    @Test
    public void should_return_the_output_provided() {
      PawnDistance actual = CodeWars.redKnight(0, 8);
      PawnDistance expected = new PawnDistance("White", 16);
      assertEquals(expected, actual);
     
      actual = CodeWars.redKnight(0, 7);
      expected = new PawnDistance("Black", 14);
      assertEquals(expected, actual);
      
      actual = CodeWars.redKnight(1, 6);
      expected = new PawnDistance("Black", 12);
      assertEquals(expected, actual);
      
      actual = CodeWars.redKnight(1, 5);
      expected = new PawnDistance("White", 10);
      assertEquals(expected, actual);   
    }
}
