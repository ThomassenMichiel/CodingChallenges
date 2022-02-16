package codewars.kyu7.funwithlists.length;

/**
 * url: https://www.codewars.com/kata/581e476d5f59408553000a4b/
 */
class Solution {
    static int length(Node head) {
        if (head == null) {
            return 0;
        }
        int length = 1;
        while (head.next != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
