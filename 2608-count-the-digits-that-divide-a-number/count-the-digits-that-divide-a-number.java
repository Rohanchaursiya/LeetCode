class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(temp!=0){
            if(temp%10!=0 && num%(temp%10)==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}