class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
        
        // Time Complexity- O(n) : iterate through the array once and each operation inside the loop is O(1)
        // Space Complexity- O(1): constant extra space
        
    }
}