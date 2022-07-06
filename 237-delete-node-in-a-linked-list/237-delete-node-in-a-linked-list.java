/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur, nxt;
        cur = node;
        nxt = cur.next;
        while(nxt!=null && nxt.next!=null){
            cur.val = nxt.val;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.val = nxt.val;
        cur.next = null;
    }
}