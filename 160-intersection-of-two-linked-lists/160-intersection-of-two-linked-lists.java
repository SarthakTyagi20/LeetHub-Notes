/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = 0, n= 0;
        ListNode p1 = headA, p2 = headB;
        while(p1!=null){
            m++;
            p1 = p1.next;
        }
        while(p2!=null){
            n++;
            p2 = p2.next;
        }
        int d=0;
        p1=headA;
        p2 = headB;
        if(m>n){
            d=m-n;
            while(d>0){
                p1 = p1.next;
                d--;
            }
        }
        else{
            d=n-m;
            while(d>0){
                p2 = p2.next;
                d--;
            }
        }
        while(p1!=null && p2!=null){
            if(p1==p2){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
}