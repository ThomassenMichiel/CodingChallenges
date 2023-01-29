package codewars.kyu7.funwithlists.lastindexof;

import codewars.kyu7.funwithlists.Node;

class Solution {
    static int lastIndexOf(Node head, Object value) {
        int pos = 0;
        int indexOf = -1;
        Node<?> current = head;
        while (current != null) {
            if (current.data == value) {
                indexOf = pos;
            }
            current = current.next;
            pos++;
        }
        return indexOf;
    }
}
