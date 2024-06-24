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
        
        ListNode fastptr = head;

        for (int i = 0; i<n; i++){
            fastptr = fastptr.next;
        }

        ListNode slowptr = head;

         if (fastptr == null){
            return head.next;
        }

        while(fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next;
        }

       

        ListNode delnode = slowptr.next;
        slowptr.next = slowptr.next.next;
        delnode.next = null; 

        return head;



        


    }
}