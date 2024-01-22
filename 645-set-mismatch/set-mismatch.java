class Solution {
    public int[] findErrorNums(int[] nums) {
       int ans[]=new int[2];
       int n=nums.length;
       ArrayList<Integer> li=new ArrayList<>();
       int dup=0;
       int sum=0;
       for(int i=0;i<nums.length;i++){
           if(!li.contains(nums[i])){
               sum+=nums[i];
               li.add(nums[i]);
           }else{
               dup=nums[i];
            //    break;
           }
       }
       ans[0]=dup;
       ans[1]=(n*(n+1)/2)-sum;
       return ans;
        
    }
}