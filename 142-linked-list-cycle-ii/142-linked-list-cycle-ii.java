/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow = head, fast = head;
        int pos=-1;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                pos=0;
                break;
            }
        }
        if(pos==-1)
            return null;
        fast=head;
        while(fast!=null){
            if(fast==slow){
                return slow;
            }
            // pos++;
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}