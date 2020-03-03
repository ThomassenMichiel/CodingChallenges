package codingbat.recursion;

public class ChangePi {
    public String changePi(String str) {
        if (!str.contains("pi")) {
            return str;
        }
        int index = str.indexOf("pi");
        str = str.substring(0,index) + "3.14" + str.substring(index + 2);
        return changePi(str);
    }
}
