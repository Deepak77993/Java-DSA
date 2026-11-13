class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        int n=sentences.length;

        for(int i=0;i<n;i++){
            String str=sentences[i];

            int m=str.length();
            int count=1;
            for(int j=0;j<m;j++){
             char ch=str.charAt(j);
             if(ch==' '){
                count++;
             }
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}