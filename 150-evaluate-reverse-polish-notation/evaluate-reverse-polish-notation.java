class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int temp;
        int ans=0;
        for(String x:tokens){
            if(x.equals("+")){
                st.add(st.pop()+st.pop());
            }else if(x.equals("-")){
                temp=st.pop();
                st.add(st.pop()-temp);

            }else if(x.equals("*")){
                temp=st.pop();
                st.add(st.pop()*temp);

            }else if(x.equals("/")){
                temp=st.pop();
                st.add(st.pop()/temp);

            }else{
                st.push(Integer.parseInt(x));
            }
            
        }
        return st.pop();  
    }
}