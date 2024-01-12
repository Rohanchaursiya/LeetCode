class Solution {
    // public int Vowel_Count(String s,int i,int j){
    //     int c=0;
    //     while(i<=j){
    //         if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
    //             c++;
    //         }
    //     }
    //     return c;
    // }
    public boolean halvesAreAlike(String s) {
        // String S=s.toLowerCase();
        int i=0;
        int j=s.length();
        j=j-1;
        int c1=0;
        //Vowel_Count(S,0,j/2);
        //int c2=0;
        //Vowel_Count(s,(j/2)+1,j-1);
        while(i<=j){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                c1++;
            }
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U'){
                c1--;
            }
            i++;
            j--;

        }
        if(c1==0)return true;
        return false;
        
    }
}