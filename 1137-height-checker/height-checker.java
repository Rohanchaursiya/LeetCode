class Solution {
    public int heightChecker(int[] heights) {
        int copy_arr[]=new int[heights.length];
        System.arraycopy(heights,0,copy_arr,0,heights.length);
        Arrays.sort(copy_arr);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!= copy_arr[i])c++;
        }
        return c;
        
    }
}