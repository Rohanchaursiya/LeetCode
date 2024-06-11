class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even_list=new ArrayList<>();
        ArrayList<Integer> odd_list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even_list.add(nums[i]);
            }else{
                odd_list.add(nums[i]);
            }
        }
        for(int i=0;i<odd_list.size();i++){
            even_list.add(odd_list.get(i));
        }
        int res[]=new int[nums.length];
        int k=0;
        for(int i=0;i<even_list.size();i++){
            res[k++]=even_list.get(i);
        }
        return res;
        
    }
}