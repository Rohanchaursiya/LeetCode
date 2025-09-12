class Solution {
    public static boolean isVowel(char ch){
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public boolean doesAliceWin(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        if(c==0){
            return false;
        }
        if(c%2!=0){
            return true;
        }
        return c%2==0?true:false;
        
    }
}