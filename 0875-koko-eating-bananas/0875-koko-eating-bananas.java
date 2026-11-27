class Solution {
    public long fun_hrs(int arr[],int speed){
        long hr=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            hr=hr+(arr[i]/speed);
            if(arr[i]%speed != 0){
                hr++;
            }
        }
        return hr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int m=piles.length;
        int low=1;
        int high=0;
        for(int i=0;i<m;i++){
           if(piles[i]>high){
            high=piles[i];
           }
        }
        int res=-1;

        while(low<=high){
            int guess=low+(high-low)/2;
            long hrs=fun_hrs(piles,guess);

            if(hrs>h){
                 low=guess+1;
            }else{
                res=guess;
                high=guess-1;
            }
        }
        return res;
    }
}