class Solution {
    public static int dp[]=new int[100001];
    public static int mod=(int)1e9+7;
    public int Count_Ways(int low,int high,int zero,int one,int pos){
        if(pos>high)return 0;
        if(dp[pos]!=-1)return dp[pos];
        int count=0;
        if(pos>=low)count++;
        count+=Count_Ways(low,high,zero,one,pos+zero);
        count+=Count_Ways(low,high,zero,one,pos+one);
        return dp[pos]=count%mod;

    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        Arrays.fill(dp,-1);
        return Count_Ways(low,high,zero,one,0);
    }
}