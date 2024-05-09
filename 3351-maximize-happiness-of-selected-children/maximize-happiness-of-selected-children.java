class Solution {
    public long maximumHappinessSum(int[] happy, int k) {
        Arrays.sort(happy);
        long ans=0,j=0;
        for(int i=happy.length-1;i>=happy.length-k;i--){
            if(happy[i]-j>=0)
                ans+=happy[i]-j;
                j++;
        }
        return ans;
    }
}