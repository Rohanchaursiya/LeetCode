class Solution {
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            int v=s.charAt(i)-'a';
            str=str+(v+1);
        }
        int sum=0;
        for(int i=0;i<str.length();i++){
            int d=str.charAt(i)-'0';
            sum+=d;
        }
        if(k==1)return sum;
        int temp=sum;
        for(int i=0;i<k-1;i++){
            sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            temp=sum;
        }
        return sum;
        
    }
}