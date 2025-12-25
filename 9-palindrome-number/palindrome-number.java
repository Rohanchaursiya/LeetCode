class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
       int xx=x,ans=0;
       while(x!=0){
        ans=ans*10+(x%10);
        x/=10;
       }
       return xx==ans;
    }
}