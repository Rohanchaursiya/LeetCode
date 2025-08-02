class Solution {
    public static boolean isPrime(int num){
        if(num<=1)return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ele : nums){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        for(int freq : hm.values()){
            if(isPrime(freq)){
                return true;
            }
        }
        return false;
    }
}