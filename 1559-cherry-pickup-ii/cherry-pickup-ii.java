class Solution {
    public int help(int i,int j1,int j2,int m,int n,int grid[][],int dp[][][]){
        if(j1<0 || j2<0 || j1>=n || j2>=n)return Integer.MIN_VALUE;
        if(i==m-1)return (j1==j2)?grid[i][j1] : grid[i][j1]+grid[i][j2];
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];

        int maxi=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2){
                    value=grid[i][j2] + help(i+1,j1+dj1,j2+dj2,m,n,grid,dp);
                }else{
                    value=grid[i][j1]+grid[i][j2] + help(i+1,j1+dj1,j2+dj2,m,n,grid,dp);
                }
                maxi=Math.max(maxi,value);
            }
        }
        return dp[i][j1][j2]=maxi;

    }
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int[m][n][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return help(0,0,n-1,m,n,grid,dp);
        
    }
}

