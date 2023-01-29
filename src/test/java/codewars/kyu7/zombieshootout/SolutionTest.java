package codewars.kyu7.zombieshootout;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals("You shot all 3 zombies.", Kata.zombieShootout(3, 10, 10));
        assertEquals("You shot 16 zombies before being eaten: overwhelmed.", Kata.zombieShootout(100, 8, 200));
        assertEquals("You shot 8 zombies before being eaten: ran out of ammo.", Kata.zombieShootout(50, 10, 8));
    }
    
    @Test
    public void randomTests() {
        assertEquals("You shot all 33 zombies.", Kata.zombieShootout(33, 47, 80));
        assertEquals("You shot all 10 zombies.", Kata.zombieShootout(10, 10, 10));
        assertEquals("You shot 24 zombies before being eaten: overwhelmed.", Kata.zombieShootout(53,12,27));
    }
}
