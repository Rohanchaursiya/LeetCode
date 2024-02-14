class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pl=new ArrayList<>();
        ArrayList<Integer> nl=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nl.add(nums[i]);
            }else{
                pl.add(nums[i]);
            }
        }
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<pl.size();i++){
            ans[k++]=pl.get(i);
            ans[k++]=nl.get(i);
        }
        return ans;
        
    }
}