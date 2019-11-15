package codewars.kyu8;

public class GrassHopperDebug {
    
    public static void main(String[] args) {
        System.out.println(weatherInfo(50));
        System.out.println(weatherInfo(23));
    }
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        return c <= 0 ? c + " is freezing temperature" : c + " is above freezing temperature";
    }
    
    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * 5/9d;
    }
}
