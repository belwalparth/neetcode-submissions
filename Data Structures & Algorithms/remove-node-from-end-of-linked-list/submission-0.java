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
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode last = dummy;
        ListNode nth = dummy;
        while(n>=0){
            last=last.next;
            n--;
        }
        while(last!=null){
            nth=nth.next;
            last=last.next;
        }
        
        nth.next=nth.next.next;
        return dummy.next;
    }
}
