class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        a[0]=num%10;
        num/=10;
        a[1]=num%10;
        num/=10;
        a[2]=num%10;
        num/=10;
        a[3]=num;
        Arrays.sort(a);
        return (a[0]*10+a[3])+(a[1]*10+a[2]);
        
    }
}