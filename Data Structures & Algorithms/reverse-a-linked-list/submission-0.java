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
        if(head==null) return head;
        ListNode p = head;
        head = head.next;
        p.next = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = p;
            p=head;
            head= temp;
        }

        head= p;
        return head;
    }
}
