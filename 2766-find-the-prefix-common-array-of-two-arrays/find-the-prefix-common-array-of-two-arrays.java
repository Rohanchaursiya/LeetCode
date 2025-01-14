class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int freq[]=new int[51];
        int ans[]=new int[A.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            if(++freq[A[i]]==2)c++;
            if(++freq[B[i]]==2)c++;
            ans[i]=c;
        }
        return ans;
    }
}