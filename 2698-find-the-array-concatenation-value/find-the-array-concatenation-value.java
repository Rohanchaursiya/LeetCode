class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        int start=0,end=nums.length-1;
        while(start<=end){
            if(start==end){
                sum+=nums[start];
            }else{
                int noOfDigit=(int)Math.log10(nums[end])+1;
                sum+=nums[start]*Math.pow(10,noOfDigit)+nums[end];
            }
            start++;
            end--;
        }
        return sum;
    }
}