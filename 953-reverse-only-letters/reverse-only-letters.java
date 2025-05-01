class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<=j){
            if(!Character.isAlphabetic(s.charAt(i)) && !Character.isAlphabetic(s.charAt(j))){
                i++;
                j--;
            }else if(!Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))){
                i++;
            }else if(Character.isAlphabetic(s.charAt(i)) && !Character.isAlphabetic(s.charAt(j))){
                j--;
            }else{
                sb.setCharAt(i,s.charAt(j));
                sb.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}