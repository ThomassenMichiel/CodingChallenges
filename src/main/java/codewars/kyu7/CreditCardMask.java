package codewars.kyu7;

public class CreditCardMask {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }

    private static String maskify(String str) {
        if (str.length() < 4) {
            return str;
        }
        String dataToMask = str.substring(0, str.length() - 4);
        String masked = dataToMask.replaceAll(".","#");
        return  masked + str.substring(str.length() - 4);
    }
}
