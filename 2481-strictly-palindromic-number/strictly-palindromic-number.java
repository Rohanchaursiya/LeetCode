class Solution {
    public boolean isPalindrome(String s){
        int i=0;
        while(i<=s.length()/2){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
            i++;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(isPalindrome(Integer.toString(n,i))==false)return false;
        }
        return true;   
    }
}