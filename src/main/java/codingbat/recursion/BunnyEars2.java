package codingbat.recursion;

public class BunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return bunnyEars2(bunnies - 1) + (bunnies % 2 == 0 ? 3 : 2);
    }
}
