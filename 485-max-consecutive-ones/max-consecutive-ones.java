class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,mc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                mc=Math.max(mc,c);
                c=0;
            }else{
                c++;
            }
        }
        mc=Math.max(mc,c);
        return mc;
        
    }
}