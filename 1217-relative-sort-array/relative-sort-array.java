class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len=0;
        for(int i : arr1){
            len=Math.max(len,i);
        }
        int count_arr[]=new int[len+1];
        for(int i : arr1){
            count_arr[i]++;
        }
        int res_arr[]=new int[arr1.length];
        int k=0;
        for(int i : arr2){
            while(count_arr[i]>0){
                res_arr[k++]=i;
                count_arr[i]--;
            }
        }
        Arrays.sort(arr1);
        for(int i : arr1){
            while(count_arr[i]>0){
                res_arr[k++]=i;
                count_arr[i]--;
            }
        }
        return res_arr;

    }
}