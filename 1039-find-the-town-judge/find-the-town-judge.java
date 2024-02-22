class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)return 1;
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<trust.length;i++){
            li.add(trust[i][0]);
            l.add(trust[i][1]);
        }
        for(int i=1;i<=n;i++){
            if(!li.contains(i)){
                if(l.contains(i)){
                    int c=0;
                    for(int j=0;j<l.size();j++){
                        if(l.get(j)==i)c++;
                    }
                    if(c==n-1)return i;
                }
            }
        }
        return -1;
        
    }
}