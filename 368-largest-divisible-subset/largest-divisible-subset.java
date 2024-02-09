class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums==null || nums.length==0)return ans;
        Arrays.sort(nums);
        int[] length=new int[nums.length];
        int[] index=new int[nums.length];
        Arrays.fill(length,1);
        Arrays.fill(index,-1);
        int max=0;
        int max_ind=-1;

        for(int i=0;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && length[j]+1>length[i]){
                    length[i]=length[j]+1;
                    index[i]=j;
                }
            }
            if(max<length[i]){
                max=length[i];
                max_ind=i;
            }
        }
        int i=max_ind;
        while(i>=0){
            ans.add(nums[i]);
            i=index[i];
        }
        return ans;    
    }
}