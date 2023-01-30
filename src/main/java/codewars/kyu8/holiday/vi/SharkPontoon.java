package codewars.kyu8.holiday.vi;

public class SharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        if (dolphin) {
            sharkSpeed *= 0.5;
        }
        while (pontoonDistance > 0) {
            pontoonDistance -= youSpeed;
            sharkDistance -= sharkSpeed;
            if (sharkDistance <= 0) {
                return "Shark Bait!";
            }
        }
        return "Alive!";
    }
}
