package codingbat.recursion;

public class BunnyEars {
    public int bunnyEars(int bunnies) {
        if (bunnies >= 1) {
            return bunnyEars(bunnies - 1) + 2;
        }
        return bunnies;
    }
}
