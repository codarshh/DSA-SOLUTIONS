/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node deleteNode(Node head, int key) {
        if (head == null) return null;
        if (head.data == key) {
            if (head.next == head) {
                return null;
            }
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = head.next;
            return head.next;
        }
        Node prev = head;
        Node curr = head.next;

        while (curr != head) {
            if (curr.data == key) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}