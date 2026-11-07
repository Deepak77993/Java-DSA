class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n= nums2.length;

        map.put(nums2[n-1],-1);
        st.push(nums2[n-1]);

        for(int i= n-2;i>=0;i--){
           while(! st.isEmpty() && nums2[i]>=st.peek()){
            st.pop();
           }
           if(st.isEmpty()){
            map.put(nums2[i],-1);
           }else{
            map.put(nums2[i],st.peek());
           }
           st.push(nums2[i]);
        }

        int ans[]= new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            ans[j]=map.get(nums1[j]);
        }
        return ans;
    }
}