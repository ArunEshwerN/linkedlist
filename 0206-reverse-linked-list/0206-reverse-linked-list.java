/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode dummy = new ListNode();

        ListNode dumptr = dummy.next;

        

        while(head!=null){

            ListNode next = head.next;
            head.next = dumptr;
            dumptr = head;
            head = next;
        }

        return dumptr;
    }
}