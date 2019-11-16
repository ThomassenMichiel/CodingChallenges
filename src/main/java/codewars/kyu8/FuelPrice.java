package codewars.kyu8;

public class FuelPrice {
    public static double fuelPrice(int litres, double pricePerLiter) {
        return (pricePerLiter - Math.min((Math.floor(litres / 2.0) * 0.05), 0.25)) * litres;
    }
}
