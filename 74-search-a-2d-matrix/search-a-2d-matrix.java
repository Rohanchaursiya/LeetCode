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
        int i=0;
        while(i<matrix.length){
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target){
                if(BinarySearch(matrix[i],target)){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}