package codewars.kyu7.zombieshootout;

/**
 * url: https://www.codewars.com/kata/5deeb1cc0d5bc9000f70aa74/solutions/java
 */
public class Kata {
    public static String zombieShootout(int zombies, int range, int ammo) {
        if (zombies > ammo && range * 2 > ammo) {
            return "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
        }
        if (zombies > range * 2) {
            return "You shot " + range * 2 + " zombies before being eaten: overwhelmed.";
        }
        return "You shot all " + zombies + " zombies.";
    }
}
