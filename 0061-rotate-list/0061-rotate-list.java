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
        int n=0;
        if(head == null || head.next==null){
            return head;
        }

        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        temp=head;
        for(int i=1;i<n-k;i++){
            temp=temp.next;
        }
        ListNode sec=temp.next;
        ListNode last =sec;

        while(last.next != null){
            last=last.next;
        }
        last.next=head;
        ListNode NewHead = temp.next;
        
        temp.next=null;

        return NewHead;
    }
}