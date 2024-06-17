class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=(int)Math.sqrt(c);
        while(i<=j){
            if((Math.pow(i,2)+Math.pow(j,2))==c)return true;
            else if((Math.pow(i,2)+Math.pow(j,2))<c)i++;
            else{
                j--;
            }
        }
        return false;
        
    }
}