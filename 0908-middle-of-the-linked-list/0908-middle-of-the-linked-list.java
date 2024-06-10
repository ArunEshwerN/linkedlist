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
    public ListNode middleNode(ListNode head) {

        ListNode cur = head;
        int count = 0;

        while(cur != null){
            
            cur = cur.next;
            count++;
        }

        int n = (count/2) + 1;

        ListNode cur2 = head;
        int count2 = 1;

        while(cur2 != null){
            
            if(count2 == n){
                break;
            }
            cur2 = cur2.next;
            count2++;
            
        }

        return cur2;
        
    }
}