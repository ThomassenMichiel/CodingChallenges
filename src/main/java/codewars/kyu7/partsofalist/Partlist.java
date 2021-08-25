package codewars.kyu7.partsofalist;

/**
 * https://www.codewars.com/kata/56f3a1e899b386da78000732
 */
public class Partlist {
    
    public static String[][] partlist(String[] arr) {
        String[][] partList = new String[arr.length - 1][2];
        for (int i = 0; i < partList.length; i++) {
            partList[i][0] = "";
            partList[i][1] = "";
            for (int j = 0; j <= i; j++) {
                partList[i][0] += arr[j] + " ";
            }
            for (int j = i + 1; j < arr.length; j++) {
                partList[i][1] += arr[j] + " ";
            }
            partList[i][0] = partList[i][0].trim();
            partList[i][1] = partList[i][1].trim();
        }
        return partList;
    }
}
