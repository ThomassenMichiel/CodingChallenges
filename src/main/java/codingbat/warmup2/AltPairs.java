package codingbat.warmup2;

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String holder = "";
        for (int i = 0; i < str.length(); i += 4) {
            if (i + 1 >= str.length()) {
                holder += str.charAt(i);
            } else {
                holder += str.substring(i, i + 2);
            }

        }
        return holder;
    }
}
