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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(-1);
        int c = 0;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head = sum;
        while(l1!=null && l2!=null){
            int s = l1.val+l2.val+c;
            c = s/10;
            int x = s%10;
            ListNode n = new ListNode(x);
            sum.next = n;
            sum = n;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int s = l1.val+c;
            c = s/10;
            int x = s%10;
            ListNode n = new ListNode(x);
            sum.next = n;
            sum = n;
            l1=l1.next;
        }
        while(l2!=null){
            int s = l2.val+c;
            c = s/10;
            int x = s%10;
            ListNode n = new ListNode(x);
            sum.next = n;
            sum = n;
            l2=l2.next;
        }
        if(c!=0){
            int s = c;
            c = s/10;
            int x = s%10;
            ListNode n = new ListNode(x);
            sum.next = n;
            sum = n;
        }
        return head.next;
    }
}