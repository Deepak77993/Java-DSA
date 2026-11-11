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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode temp = dummy;

        for(int i=1;i<left;i++){
            temp=temp.next;
        }

        // REVERSE THE LIST B/W LEFT AND RIGHT

        ListNode prev=null;
        ListNode curr= temp.next;
        ListNode next;

        ListNode first=curr;
        int times = right-left+1;

        while(times != 0 ){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;
            times--;
        }

        temp.next=prev;
        first.next=curr;

        return dummy.next;

    }
}