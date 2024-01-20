class Solution {
    private int[] nextSmaller(int arr[]){
        Stack<Integer> st=new Stack<Integer>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i]=arr.length;
            }
            else {
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
       
    }
    private int[] prevSmaller(int arr[]){
        Stack<Integer> st=new Stack<Integer>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
        
    }
    public int sumSubarrayMins(int[] arr) {
        int nextSmall[]=nextSmaller(arr);
        int prevSmall[]=prevSmaller(arr);
        int mod=1000000007;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            int first=i-prevSmall[i];
            int second=nextSmall[i]-i;
            long prod=(first*second)%mod;
            prod=(prod*arr[i])%mod;
            sum=(sum%mod+prod)%mod;
        }
        return (int)sum;
    }
}