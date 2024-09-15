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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack();
        ListNode a = head;
        while(a!=null){
            s.push(a.val);
            a=a.next;
        }
        a=head;
        while(a!=null && s.pop()==a.val){
            a=a.next;
        }
       return a==null;

    }
}