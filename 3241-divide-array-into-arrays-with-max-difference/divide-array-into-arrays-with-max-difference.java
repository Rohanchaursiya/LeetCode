// class Solution {
//     public int[][] divideArray(int[] nums, int k) {
//         Arrays.sort(nums);
//         int n=nums.length/3;
//         int x=0;
//         int array[][]={};
//         int ans[][]=new int[n][3];
//         int z=1;
//         while(z<nums.length){
//             // if(i%3!=0 && nums[i]-nums[i-1]>k){
//             //     return array;
//             // }
//             // if(z%3==0){
//             //     z++;
//             // }else{
//                 if(nums[z]-nums[z-1]>k){
//                     return array;
//                 }else{
//                     z++;
//                 }
//             }
//         // }
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<3;j++){
//                 ans[i][j]=nums[x];
//                 x++;
//             }
//         }
//         return ans;
        
//     }
// }

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[0][0];
        
        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i % 3 == 0) {
                if (nums[i + 2] - nums[i] <= k) {
                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = triplet;
                } else {
                    return new int[0][0];
                }
            }
        }
        
        return result;
    }
}