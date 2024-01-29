class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*'){
                c++;
            }
            if(!st.isEmpty() && s.charAt(i)!='*' && c>0){
                c-=1;
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        return str;
    }
}