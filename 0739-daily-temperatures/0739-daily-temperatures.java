class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st= new Stack<>();
        int n= temperatures.length;

        ans.add(0);
        st.push(n-1);

        for(int i=n-2;i>=0;i--){
           
            while(! st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
             st.pop();
           
            }
            if(st.isEmpty()){
                ans.add(0);
            }else{
                ans.add(st.peek()-i);
               
            }
             st.push(i);
        }
        Collections.reverse(ans);

       int res[]=new int[ans.size()];
       for(int j=0;j<ans.size();j++){
        res[j]=ans.get(j);
       }
       return res;
    }
}