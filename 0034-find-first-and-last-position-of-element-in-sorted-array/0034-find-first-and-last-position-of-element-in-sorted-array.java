class Solution {
    public int first(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int guess = (low+high)/2;
            if(arr[guess]<target){
                low=guess+1;
            }else if(arr[guess]>target){
                high=guess-1;
            }else{
                result=guess;
                high=guess-1;
            }
        }
        return result;
    }

     public int last(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int guess = (low+high)/2;
            if(arr[guess]<target){
                low=guess+1;
            }else if(arr[guess]>target){
                high=guess-1;
            }else{
                result=guess;
                low=guess+1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        int i=first(nums,target);
        int j=last(nums,target);

        return new int[]{i,j};
    }
}