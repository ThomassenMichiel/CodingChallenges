package codewars.kyu7.funwithlists.indexof;

import codewars.kyu7.funwithlists.Node;

class Solution {
    static int indexOf(Node head, Object value) {
        int pos = 0;
        Node<?> current = head;
        while (current != null) {
            if (current.data == value) {
                return pos;
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
}
