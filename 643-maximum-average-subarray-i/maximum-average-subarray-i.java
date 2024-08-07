class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        int start=0;
        int j=0;
        double sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i>=k-1){
                if(sum/k>max)max=sum/k;
                sum-=nums[start];
                start++;
            }
        }
        return max;
        
    }
}