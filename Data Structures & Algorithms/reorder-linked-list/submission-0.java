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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(rev!=null){
            ListNode next=rev.next;
            rev.next=prev;
            prev=rev;
            rev=next; 
        }
        rev=prev;
        ListNode curr=head;
        while(curr!=null&& rev!=null){
            ListNode temp1 = curr.next;
ListNode temp2 = rev.next;

curr.next = rev;
rev.next = temp1;

curr = temp1;
rev = temp2;
        }
        if(rev!=null){
            curr.next=rev;
        }
        while(curr!=null){
            System.out.print(curr.val+",");
            curr=curr.next;
        }
    }
}
