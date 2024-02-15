class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long Pre_sum=0;
        long Cur_sum=0;
        for(int i=0;i<nums.length;i++){
           if (nums[i]<Cur_sum) {
                Pre_sum=Cur_sum+nums[i];
            }
            Cur_sum+=nums[i];
        }
        return (Pre_sum!=0)? Pre_sum : -1; 
    }
}