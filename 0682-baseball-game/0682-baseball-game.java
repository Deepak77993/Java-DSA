class Solution {
    public int calPoints(String[] operations) {

        Stack <Integer> st = new Stack<>();
        int n=operations.length;

        for(int i=0;i<n;i++){
            String ch=operations[i];

          
            if(ch.equals("+")){
                int a= st.pop();
               
                int b=st.peek();
                st.push(a);
                st.push(a+b);
                continue;
            }
            else if(ch.equals("D")){
                int c= st.peek();
                st.push(c*2);
               
            }
            else if(ch.equals("C")){
              st.pop();
              
            }else{
              st.push(Integer.parseInt(ch));
            }
           
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+ st.peek();
            st.pop();
        }
        return sum;
    }
}