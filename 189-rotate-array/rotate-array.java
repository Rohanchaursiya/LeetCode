class Solution {
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void RightRotate(int arr[],int n,int k){
        if(n==0)return;
        k=k%n;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    public void rotate(int[] nums, int k) {
        RightRotate(nums,nums.length,k);
    }
}