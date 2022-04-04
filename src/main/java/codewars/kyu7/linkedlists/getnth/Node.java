package codewars.kyu7.linkedlists.getnth;

/**
 * https://www.codewars.com/kata/55befc42bfe4d13ab1000007
 */
class Node {
    public int data;
    public Node next = null;
    
    public static int getNth(Node n, int index) throws Exception {
        if (n == null) {
            throw new Exception("List is empty");
        }
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return n.data;
            }
            n = n.next;
        }
        throw new Exception("Index out of bounds");
    }
}
