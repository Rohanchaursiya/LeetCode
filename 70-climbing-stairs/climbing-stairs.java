class Solution {
    public int Help(int n,int dp[]){
        if(n==0 || n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        return dp[n]= Help(n-1,dp)+Help(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Help(n,dp);
    }
}