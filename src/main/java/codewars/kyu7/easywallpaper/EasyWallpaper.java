package codewars.kyu7.easywallpaper;

public class EasyWallpaper {
    private String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    
    public String wallpaper(double l, double w, double h) {
        return l == 0 || w == 0 || h == 0 ? numbers[0] : numbers[(int) ((l + w) * 2 * 100 / 52 * h * 100 / 1000 * 1.15 + 1)];
    }
}
