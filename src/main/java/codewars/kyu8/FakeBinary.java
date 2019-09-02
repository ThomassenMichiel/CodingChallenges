package codewars.kyu8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        for (int i = 0; i < numberString.length(); i++) {
            String binary = numberString.charAt(i) < '5' ? "0" : "1";
            numberString = numberString.substring(0,i) + binary + numberString.substring(i+1);
        }
        return numberString;
    }
}
