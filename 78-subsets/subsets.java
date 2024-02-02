class Solution {
    private void help(int nums[],int idx,ArrayList<Integer> res,List<List<Integer>> ans){
        ans.add(new ArrayList<>(res));
        for(int i=idx;i<nums.length;i++){
            res.add(nums[i]);
            help(nums,i+1,res,ans);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        help(nums,0,new ArrayList<>(),ans);
        return ans;
        
    }
}