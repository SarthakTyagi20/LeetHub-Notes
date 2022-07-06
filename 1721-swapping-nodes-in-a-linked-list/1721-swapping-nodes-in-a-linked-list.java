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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next == null){
            return head;
        }
        int n = 0;
        ListNode ptr = head;
        while(ptr!=null){
            n++;
            ptr = ptr.next;
        }
        int e = n-k;
        int s = k-1;
        ptr=head;
        ListNode ptr2 = head;
        while(s>0){
            s--;
            ptr = ptr.next;
        }
        while(e>0){
            e--;
            ptr2 = ptr2.next;
        }
        int z = ptr.val;
        ptr.val = ptr2.val;
        ptr2.val = z;
        return head;
    }
}