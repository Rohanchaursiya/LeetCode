class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet=new HashSet<>();
        HashSet<Integer> colSet=new HashSet<>();
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==0){
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }
        for(int row: rowSet){
            for(int col=0;col<matrix[row].length;col++){
                matrix[row][col]=0;
            }
        }
        for(int col: colSet){
            for(int row=0;row<matrix.length;row++){
                matrix[row][col]=0;
            }
        }
        
    }
}