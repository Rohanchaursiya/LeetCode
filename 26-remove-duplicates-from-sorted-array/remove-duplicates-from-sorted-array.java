class Solution {
    public int removeDuplicates(int[] nums) {
        // Brute Force
        // int k=0;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]!=nums[i+1]){
        //         nums[k++]=nums[i];
        //     }
        // }
        // if(nums[nums.length-1]!=nums[k]){
        //     nums[k++]=nums[nums.length-1];
        // }
        // return k;

        //Optimal Solution
        if(nums.length==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                nums[k++]=nums[i];
            }
        }
        return k;

        // Time Complexity- O(n)
        // Space Complexity- O(1)
    }
}