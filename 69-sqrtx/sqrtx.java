class Solution {
    private int binarySearch(int x){
        int low=0,high=x-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid==x){
                return mid;
            }else if((long)mid*mid>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return Math.round(high);
    }
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        return binarySearch(x);
    }
}