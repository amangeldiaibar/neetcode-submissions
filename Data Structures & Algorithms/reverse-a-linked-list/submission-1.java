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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode result = null;

        while(cur != null){
            ListNode tmp = cur.next;// null
            cur.next = prev; // 
            prev = cur;
            cur = tmp;
        }
        
        return prev;
    }
}
// null <- 0 <- 1 <- 2 <- 3
