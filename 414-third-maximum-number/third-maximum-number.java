class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int k=3;
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=nums.length-1;i>0;i--){
            max=Math.max(max,nums[i]);
            if(nums[i]!=nums[i-1]){
                k--;
                ans=nums[i-1];
            }
            if(k==1){
                return ans;
            }
        }
        return max;
        
    }
}