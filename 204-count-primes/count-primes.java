class Solution {

    public int countPrimes(int n) {
        if(n<=1)return 0;
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<(long)n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<(long)n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]==true)c++;
        }
        return c;
        
    }
}