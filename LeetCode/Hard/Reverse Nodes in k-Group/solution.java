/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Count total nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Store all values in an array
        int[] values = new int[count];
        temp = head;
        int index = 0;
        while (temp != null) {
            values[index] = temp.val;
            index++;
            temp = temp.next;
        }
        
        // Reverse every k elements in array
        for (int i = 0; i + k <= count; i += k) {
            reverseArray(values, i, i+k-1);
        }
        
        // Put values back into linked list
        temp = head;
        index = 0;
        while (temp != null) {
            temp.val = values[index];
            index++;
            temp = temp.next;
        }
        
        return head;
    }

    // Helper method to reverse portion of array
    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}