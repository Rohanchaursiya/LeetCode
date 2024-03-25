class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i : nums){
            if(!hs.contains(i)){
                hs.add(i);
            }else{
                ans.add(i);
            }
        }
        return ans;
        
    }
}