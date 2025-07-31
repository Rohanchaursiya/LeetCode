class Solution {
    public int digitSum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        return x%(digitSum(x))==0 ? digitSum(x) : -1;
    }
}