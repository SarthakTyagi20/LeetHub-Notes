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
        if(head==null || head.next==null)
            return true;
        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = rev(slow.next);
        slow = slow.next;
        fast = head;
        while(slow!=null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode rev(ListNode head){
        ListNode pr = null, nxt = null, cur = head;
        while(cur!=null){
            nxt = cur.next;
            cur.next = pr;
            pr = cur;
            cur = nxt;
        }
        return pr;
    }
}