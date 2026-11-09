class Solution {
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        Stack<int[]> st = new Stack<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek()[0] != ch){
               st.push(new int[]{ch,1});
            }else{
                st.peek()[1]++;
            }

            if(st.peek()[1] == k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
            int p[]= st.pop();
            while(p[1]-->0){
                sb.append((char)p[0]);
            }
        }
        return sb.reverse().toString();
    }
}