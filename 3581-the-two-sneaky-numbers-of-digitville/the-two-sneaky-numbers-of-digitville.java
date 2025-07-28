class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans[]=new int[2];
        int i=0;
        for(int ele : nums){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
                ans[i++]=ele;
            }else{
                hm.put(ele,1);
            }
        }
        return ans;
    }
}