class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long sum1=0;
        long sum2=0;
        for(int i=0;i<arr.length;i++){
            sum1+=Math.abs(arr[i]-brr[i]);
        }
        // long sum=sum1+k;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<arr.length;i++){
            sum2+=Math.abs(arr[i]-brr[i]);
            // System.out.println(sum2);
        }
        sum2=sum2+k;
        return Math.min(sum1,sum2);
        
    }
}