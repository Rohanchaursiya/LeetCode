class Solution {
    public static int binarySearch(int low, int high, int arr[], int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, nums, target);  
    }
}
