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
        ListNode dummy=new ListNode();
        ListNode sum=dummy;
        int carry=0;
        while(l1!=null||l2!=null){
            int val1=(l1==null)? 0:l1.val;
            int val2=(l2==null)? 0:l2.val;
            int sum1=(val1+val2+carry)%10;
            carry=(val1+val2+carry)/10;
            ListNode node=new ListNode(sum1);
            sum.next=node;
            sum=sum.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry>0){
            ListNode node=new ListNode(carry);
            sum.next=node;
        }
        return dummy.next;
    }
}
