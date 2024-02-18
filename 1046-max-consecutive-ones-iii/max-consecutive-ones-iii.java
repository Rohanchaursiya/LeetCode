class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,pointer=0,ans=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)pointer++;
            while(pointer>k){
                if(nums[j]==0){
                    pointer--;
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;

        
    }
}