class Solution {
    public int trailingZeroes(int n) {
        int trailingZeroes=0;
        for(int i=5;n/i>=1;i*=5){
            trailingZeroes+=n/i;
        }
        return trailingZeroes;
    }
}