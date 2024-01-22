class Solution {
   
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length()==1)return true;
        s=s.toLowerCase();
        int i=0;
        int len=s.length();
        int j=len-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else{
                if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)) && s.charAt(i)== s.charAt(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}