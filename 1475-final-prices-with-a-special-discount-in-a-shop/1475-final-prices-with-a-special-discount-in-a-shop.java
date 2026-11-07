class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        Stack<Integer> st = new Stack<>();
        int n=prices.length;

        ans[n-1]=prices[n-1];
        st.push(prices[n-1]);

        for(int i=n-2;i>=0;i--){
            while(! st.isEmpty() && prices[i]<st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=prices[i];
            }else{
                ans[i]=prices[i] - st.peek();
            }
            st.push(prices[i]);
        }
        return ans;
    }
}