class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))hm.put(arr[i],1);
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int value : hm.values()){
            if(!li.contains(value)){
                li.add(value);
            }
            else{
                return false;
            }
        }
        return true;
    }
}