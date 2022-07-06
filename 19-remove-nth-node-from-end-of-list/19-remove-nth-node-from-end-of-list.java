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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        if(head.next==null && n==1)
            return null;
        int sz = 0;
        ListNode ptr = head;
        while(ptr!=null){
            sz++;        
            ptr = ptr.next;
        }
        int x = sz-n;
        if(x==0)
            return head.next;
        ptr = head;
        ListNode pr = null;
        // x--;
        while(x>0){
            pr = ptr;
            ptr = ptr.next;
            x--;
        }
        pr.next = ptr.next;
        return head;
    }
}