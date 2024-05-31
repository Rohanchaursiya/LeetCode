class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0) + 1);
        }
        int ans[]=new int[2];
        int k=0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                ans[k++]=entry.getKey();
            }
        }
        return ans;

        
    }
}