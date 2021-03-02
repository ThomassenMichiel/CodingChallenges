package codewars.kyu6.convertstringtocamelcase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    
    @Test
    public void thirdTest() {
        String input = "Rockstar_desert_north_Street_Green_desert_side_Yellow_Yellow";
        assertEquals("RockstarDesertNorthStreetGreenDesertSideYellowYellow", Solution.toCamelCase(input));
    }
    @Test
    public void fourthTest() {
        String input = "rockstar_desert_north_Street_Green_desert_side_Yellow_Yellow";
        assertEquals("rockstarDesertNorthStreetGreenDesertSideYellowYellow", Solution.toCamelCase(input));
    }
    
}
