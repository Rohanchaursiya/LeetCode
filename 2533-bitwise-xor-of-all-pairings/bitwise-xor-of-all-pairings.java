class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        int final_xor=0;
        for(int i=0;i<nums1.length;i++)x^=nums1[i];
        for(int i=0;i<nums2.length;i++)y^=nums2[i];
        if((nums1.length&1)==1)final_xor^=y;
        if((nums2.length&1)==1)final_xor^=x;
        return final_xor;
    }
}