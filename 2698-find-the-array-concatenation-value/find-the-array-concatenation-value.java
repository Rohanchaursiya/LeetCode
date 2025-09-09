class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=(nums.length%2!=0)? nums[nums.length/2] : 0;
        int st=0;
        int end=nums.length-1;
        while(st<end){
            String concat=Integer.toString(nums[st])+Integer.toString(nums[end]);
            System.out.println(concat);
            sum+=Long.parseLong(concat);
            st++;
            end--;
        }
        return sum;
    }
}