class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2)return nums;
        Arrays.sort(nums);
        int ans[]=new int[2];
        int k=0,c=0;
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])c++;
            }
            if(c==1){
                ans[k++]=nums[i];
                c=0;
            }
        }
        return ans;
        
    }
}