class Solution {
    public String reversePrefix(String word, char ch) {
       int n=word.length();
       Stack<Character> st=new Stack<>();
       StringBuilder sb = new StringBuilder("");
       int i=0;

       for( i=0;i<n;i++){
        char c = word.charAt(i);
          st.push(c);

          if(c==ch){
            break;
          }

       } 
       if(st.peek() != ch){
        return word;
       }
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       sb.append(word.substring(i+1));

       return sb.toString();
    }
}