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
        if(head==null || head.next==null || head.next.next == null) return;
        //find the mid using fast and slow pointers
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        //cut the repeated mid in both [1,2,3,4] right now [1,2,3] [3,4]
        ListNode mid = slow;
        slow = slow.next;
        mid.next=null; //[1,2->3-null] [4]
        //System.out.println("mid "+mid.val);
        //System.out.println("slow "+slow.val);

        //now reverse it from mid till end

        //setting first node to null and backing it up
        ListNode p = slow;
        slow = slow.next;
        p.next = null;

        while(slow!=null){
            //going to next node so we will update slow 
            ListNode temp = slow.next;
            slow.next = p;
            p = slow;

            slow= temp;
        }
        slow = p;
       
        //reordering
        ListNode newHead = head;
        while(slow!=null && head!=null){
            ListNode temp1 = head.next;
            head.next = slow;
            ListNode temp2 = slow.next;
            slow.next = temp1;
            head=temp1;
            slow = temp2;
        }
        head = newHead;
    }
}
