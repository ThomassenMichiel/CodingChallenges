package codewars.kyu8;

public class GravityBetweenTwoObjects {
    
    public static double solution(final double[] arrVal, final String[] arrUnit) {
        double g = 6.67 * Math.pow(10,-11);
        double[] values = normalizeValues(arrVal, arrUnit);
        return g * ((values[0]*values[1]) / Math.pow(values[2],2));
    }
    
    private static double[] normalizeValues(final double[] values, final String[] units) {
        double[] normalizedValues = new double[3];
        for (int i = 0; i < values.length; i++) {
            switch (units[i]) {
                case "cm":
                    normalizedValues[i] = divisionHelper(values[i],100);
                    break;
                case "mm":
                case "g":
                    normalizedValues[i] = divisionHelper(values[i],1_000);
                    break;
                case "μm":
                case "mg":
                    normalizedValues[i] = divisionHelper(values[i],1_000_000);
                    break;
                case "μg":
                    normalizedValues[i] = divisionHelper(values[i],1_000_000_000);
                    break;
                case "lb":
                    normalizedValues[i] = values[i] * 0.453592;
                    break;
                case "ft":
                    normalizedValues[i] = values[i] * 0.3048;
                    break;
                default:
                    normalizedValues[i] = values[i];
            }
        }
        return normalizedValues;
    }
    
    private static double divisionHelper(double value, double divider) {
      return value / divider;
    }
}
