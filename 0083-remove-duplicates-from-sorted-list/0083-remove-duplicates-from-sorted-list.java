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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode a = head;
        
        while (a.next != null) {  // Fixed the condition
            if (a.val == a.next.val) {
                a.next = a.next.next;  // Skip the duplicate node
            } else {
                a = a.next;  // Move to the next node if no duplicate
            }
        }
        
        return head;
    }
}
