class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0; 

        
        if (s.length() == 1) {
            if (s.equals(" ")) {
                return -1;
            }
            return 1; 
        }

        
        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') {
                count++;

               
                if (i != 0 && s.charAt(i - 1) == ' ') {
                    break;
                }
            }
        }

        return count; 
    }
}