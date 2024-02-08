class Solution {
    public int dp[]=new int[10001];
    public int help(int n){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=(int)Math.sqrt(n);i>=1;i--){
            if(n>=i*i){
                min=Math.min(min,1+help(n-(i*i)));
            }
        }
        return dp[n]=min;
    }
    public int numSquares(int n) {
        Arrays.fill(dp,-1);
        return help(n);
        
    }
}