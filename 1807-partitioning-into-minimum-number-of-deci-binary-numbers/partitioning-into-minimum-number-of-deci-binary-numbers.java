class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            int v=n.charAt(i);
            if(v>max){
                max=v;
            }
        }
        return max-48;
        
    }
}