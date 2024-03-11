class Solution {
    public static String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public String customSortString(String order, String s) {
        sortString(s);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        String ns="";
        String S="";
        for(char ch : order.toCharArray()){
            if(hm.containsKey(ch)){
                int n=hm.get(ch);
                while(n--!=0){
                    ns+=ch;
                }
                hm.remove(ch);
            }
        }
        for(char ch : hm.keySet()){
            
            int n=hm.get(ch);
            while(n--!=0)S+=ch;
        }
        return ns+S;
        
    }
}