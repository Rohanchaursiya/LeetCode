class Solution {
    public int trailingZeroes(int n) {
        int trailingZeroes=0,i=5;
        while(n/i>=1){
            trailingZeroes+=n/i;
            i*=5;
        }
        return trailingZeroes;
    }
}