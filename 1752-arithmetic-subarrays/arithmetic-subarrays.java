class Solution {
    public boolean isArithmetic(ArrayList<Integer> li){
        int d=li.get(1)-li.get(0);
        for(int i=1;i<li.size();i++){
            if(li.get(i)-li.get(i-1)!=d)return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> ans=new ArrayList<Boolean>();
        for(int j=0;j<l.length;j++){
            ArrayList<Integer> li=new ArrayList<>();
            for(int i=l[j];i<=r[j];i++){
                li.add(nums[i]);
            }
            Collections.sort(li);
            boolean val=isArithmetic(li);
            ans.add(val);
        }
        return ans;
        
    }
}