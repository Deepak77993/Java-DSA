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
    public int[] nextLargerNodes(ListNode head) {
       
        ArrayList<Integer> list= new ArrayList<>();
        Stack<Integer> st =new Stack<>();
        
        ListNode temp=head;
        while(temp !=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int n=list.size();
        int ans[]= new int[n];

        ans[n-1]=0;
        st.push(list.get(n-1));

        for(int i=n-2;i>=0;i--){
            while(! st.isEmpty() && list.get(i)>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=st.peek();
            }
            st.push(list.get(i));
        }
          return ans;
    }
}