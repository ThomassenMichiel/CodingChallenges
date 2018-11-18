package codingbat.warmup2;

public class StringYak {
    public static void main(String[] args) {
//        System.out.println(stringYak("yakpak"));
//        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("123ya"));
    }

    public static String stringYak(String str) {
        if (str.length() < 3) {
            return str;
        }

        String holder = "";
        for (int i = 0; i < str.length();) {
            if (str.charAt(i) != 'y' || (str.charAt(i) != 'y' && str.charAt(i+2) != 'k')) {
                if (i + 3 > str.length()) {
                    holder += str.substring(i);
                } else {
                    holder += str.substring(i,i+3);
                }
                i += 3;
            } else {
                i++;
            }
        }
        return holder;
    }
}
