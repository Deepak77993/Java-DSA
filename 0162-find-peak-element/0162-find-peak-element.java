class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int guess=low+(high-low)/2;
            if(guess == 0 || nums[guess]>=nums[guess-1]){
                if(nums[guess]>=nums[guess+1]){
                    return guess;
                }else{
                    low=guess+1;
                }
            }else{
                high=guess-1;
            }
        }
        return low;
    }
}