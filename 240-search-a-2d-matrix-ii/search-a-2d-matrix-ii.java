class Solution {
    public static boolean BinarySearch(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int ans=-1;
        for(int i=0;i<matrix.length;i++){
            if(BinarySearch(matrix[i],target)){
                ans=1;
            }
        }
        return (ans==1);
    }
}