class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i=0;i<s.length()-1;i++){
            String ns=""+s.charAt(i+1)+s.charAt(i);
            if(s.contains(ns.substring(0)))return true;
        }
        return false;
        
    }
}