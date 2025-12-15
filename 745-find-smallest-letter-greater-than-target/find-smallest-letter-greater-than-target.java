class Solution {

    public static char binarySearch(int low, int high, char arr[], char target){
        char ans=arr[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=arr[mid];
                high=mid-1;
            }else {
                low =mid+1;
            }
        }
        return ans;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        return binarySearch(0, letters.length-1, letters, target);
    }
}