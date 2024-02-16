class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        // int m=grid.length;
        // int n=grid[0].length;
        int rowdiff[]=new int[grid.length];
        int coldiff[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    rowdiff[i]++;
                    coldiff[j]++;
                }else{
                    rowdiff[i]--;
                    coldiff[j]--;
                }
            }
        }
        int ans[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=rowdiff[i]+coldiff[j];
            }
            
        }
        return ans;
        
    }
}