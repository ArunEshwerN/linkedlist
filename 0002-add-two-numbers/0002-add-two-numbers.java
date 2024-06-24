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
        ListNode t1 = l1;
        ListNode t2 = l2;
        int sum = 0;
        int carry = 0;
        ListNode dummynode = new ListNode();
        ListNode current = dummynode;

        while (t1 != null || t2 != null){

            sum = carry;

            if (t1 != null){
                sum = sum + t1.val;
            }

            if (t2 != null){
                sum = sum + t2.val;
            }

            // sum = sum%10; // Wrong

            carry = sum/10;

            ListNode newnode = new ListNode(sum%10, null);

            current.next = newnode;

            current = current.next;

            if (t1!=null){
                t1 = t1.next;
            }

            if (t2!=null){
                t2 = t2.next;
            }


        }

        if (carry != 0){

            ListNode newnode = new ListNode(carry, null);
            current.next = newnode;

            current = current.next;
        }

        return dummynode.next;
    }
}