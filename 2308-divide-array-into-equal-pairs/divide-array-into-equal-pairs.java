class Solution {
    public boolean divideArray(int[] nums) {
        int freq[]=new int[501];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                if(freq[i]%2==0){
                    ans+=freq[i]/2;
                }
            }
        }
        return (ans == nums.length/2);
    }
}