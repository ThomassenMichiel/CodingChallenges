package codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

class UnfinishedLoopBugFix1 {
    public static List CreateList(int number) {
        List list = new ArrayList();
        
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        
        return list;
    }
}
