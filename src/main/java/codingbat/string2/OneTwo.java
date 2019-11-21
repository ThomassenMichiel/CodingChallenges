package codingbat.string2;


public class OneTwo {
    public String oneTwo(String str) {
        str = str.substring(0,str.length() - (str.length() % 3));
        String modifiedString = "";
        for (int i = 0; i < str.length()-1; i += 3) {
            modifiedString += str.substring(i+1,i+3) + str.substring(i,i+1);
        }
        return modifiedString;
    }
}
