class Solution {
    public boolean isAnagram(String s, String t) {
        String sortedString1= "",sortedString2="";
        char[] tempArr1= s.toCharArray();
        char[] tempArr2= t.toCharArray();
        Arrays.sort(tempArr1);
        Arrays.sort(tempArr2);
        sortedString1= new String(tempArr1);
        sortedString2= new String(tempArr2);
        return sortedString1.equals(sortedString2);
    }
}