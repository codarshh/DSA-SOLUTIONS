// public class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }
        curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
        int steps = length - k;
        curr = head;
        for (int i = 1; i < steps; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}



// BY CONVERTING INTO ARRAY 


// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {

//         if (head == null || head.next == null || k == 0) {
//             return head;
//         }

//         int length = 0;
//         ListNode curr = head;

//         while (curr != null) {
//             length++;
//             curr = curr.next;
//         }

//         k = k % length;

//         if (k == 0) {
//             return head;
//         }

//         int[] arr = new int[length];

//         curr = head;
//         for (int i = 0; i < length; i++) {
//             arr[i] = curr.val;
//             curr = curr.next;
//         }

//         curr = head;

//         for (int i = 0; i < length; i++) {
//             curr.val = arr[(i - (length - k) + length) % length];
//             curr = curr.next;
//         }

//         return head;
//     }
// }