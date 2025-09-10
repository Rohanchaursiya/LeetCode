class Solution {
    public static int binarySearch(int nums[],int low,int high){
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public int findPeakElement(int[] nums) {
        return binarySearch(nums,0,nums.length-1);
    }
}