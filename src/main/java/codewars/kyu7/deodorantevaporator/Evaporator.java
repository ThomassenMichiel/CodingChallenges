package codewars.kyu7.deodorantevaporator;

/**
 * url: https://www.codewars.com/kata/5506b230a11c0aeab3000c1f
 */
public class Evaporator {
    
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        double actualContent = content;
        double thresholdMilliliters = content * (threshold / 100);
        while (actualContent >= thresholdMilliliters) {
            actualContent -= actualContent * (evap_per_day / 100);
            days++;
        }
        return days;
    }
}
