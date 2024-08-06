class Solution {
    public static int Jay_Shree_Ram(String word){
        int Teri=1;
        int Solution=0;
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch : word.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Integer> Kajal=hm.values().stream().sorted((a, b)-> Integer.compare(b, a)).collect(Collectors.toList());
        for (int z=0;z<Kajal.size();z++) {
            if(z==8 || z==16 ||z==24) {
                Teri++;
            }
            Solution+=(Kajal.get(z)*Teri);
        }
        return Solution;
    }
    public int minimumPushes(String baigan) {
        return Jay_Shree_Ram(baigan);
    }
}