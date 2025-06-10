class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int max=0,min=s.length();
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                if(freq[i]%2!=0){
                    max=Math.max(max,freq[i]);
                }else{
                    min=Math.min(min,freq[i]);
                }
            }
        }
        return max-min;
        
    }
}