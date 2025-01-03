class Solution {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long ls=0;
        long rs=0;
        for(int i : nums){
            rs+=i;
        }
        for(int i=0;i<nums.length-1;i++){
            ls+=nums[i];
            rs-=nums[i];
            if(ls>=rs){
                c++;
            }
        }
        return c;
        
    }
}