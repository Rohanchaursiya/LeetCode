class Solution {
    public static boolean isVowel(char ch){
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.setCharAt(i,'a');
                li.add((int)s.charAt(i));
            }
        }
        Collections.sort(li);
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='a'){
                int val=li.get(ind);
                sb.setCharAt(i,(char)val);
                ind++;
            }
        }
        return sb.toString(); 
    }
}