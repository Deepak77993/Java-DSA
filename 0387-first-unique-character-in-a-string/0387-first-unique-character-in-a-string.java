class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int j=0;j<s.length();j++){
            char ch2=s.charAt(j);

            if(map.get(ch2)==1){
                return j;
            }
        }
        return -1;
    }
}