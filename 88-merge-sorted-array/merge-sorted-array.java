class Solution {
    // public void Print(int length,int arr[]){
    //     for(int i=0;i<length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j++];
        }
        Arrays.sort(nums1);
    }
}