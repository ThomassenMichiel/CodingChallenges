package codewars.kyu7.linkedlists.pushandbuildonetwothree;

/**
 * https://www.codewars.com/kata/55be95786abade3c71000079
 */
class Node {
    
    int data;
    Node next = null;
    
    Node(final int data) {
        this.data = data;
    }
    
    public static Node push(final Node head, final int data) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
    
    public static Node buildOneTwoThree() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        return head;
    }
}
