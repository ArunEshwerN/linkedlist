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
    public ListNode rotateRight(ListNode head, int k) {

        ListNode temp = head;
        int len = 1;

        if (head == null || head.next == null || k == 0){
            return head;
        }

        while(temp.next!=null){
            temp = temp.next;
            len++;
        }

        if (k%len == 0){
            return head;
        } 
        
        k = k % len;

        int rot = len - k;

        temp.next = head;

        ListNode temp2 = head;

        int count = 1;

        while (temp2!= null){
            if (count == rot){
                break;
            }
            temp2 = temp2.next;
            count++;
        }



        ListNode newhead = temp2.next;
        temp2.next = null;

        return newhead;


    }
}